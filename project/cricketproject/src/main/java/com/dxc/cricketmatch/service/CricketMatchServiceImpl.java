package com.dxc.cricketmatch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.cricketmatch.exception.MatchAlreadyExistException;
import com.dxc.cricketmatch.exception.MatchNotFoundException;
import com.dxc.cricketmatch.model.NewMatch;
import com.dxc.cricketmatch.repository.CricketMatchRepository;

/**
 * @author Debayan
 * CricketMatchServiceImpl it is implements CricketMatchService interface
 * here will write business logic code.
 *
 */
@Service
public class CricketMatchServiceImpl implements CricketMatchService {

	@Autowired
	private CricketMatchRepository repository;

	@Override
	public List<NewMatch> getAllRecommendedNewMatches() {
		return repository.findAll();
	}

	@Override
	public boolean addToRecommended(NewMatch newMatch) throws MatchAlreadyExistException {
		Optional<NewMatch> matchPresent = repository.findById(newMatch.getMatchId());
		if (matchPresent.isPresent()) {
			NewMatch match=matchPresent.get();
			String userEmail=newMatch.getEmail().get(0);
			List<String> email= match.getEmail();
			for (String string : email) {
				if(string.equals(userEmail)) {
					throw new MatchAlreadyExistException("Match Already Recommended");
				}
			}
			email.add(userEmail);
			match.setEmail(email);
			repository.save(match);
			return true;
		} else {
			repository.save(newMatch);
			return true;	
		}
	}

	@Override
	public boolean unrecommendMatch(long id, String email) throws MatchNotFoundException {
		Optional<NewMatch> matchPresent = repository.findById(id);
		if(matchPresent.isPresent()) {
			NewMatch match = matchPresent.get();
			List<String> users = match.getEmail();
			
			for (String string : users) {
				if(string.equals(email)) {
					System.out.println("matches "+email);
					users.remove(string);
					break;
				}
			}
			if(users.isEmpty()) {
				repository.deleteById(id);
				return true;
			}else {
				System.out.println("removed "+users);
				match.setEmail(users);
				repository.save(match);
				return true;
			}
		}else {
			throw new MatchNotFoundException("Match Not Found Exception");
		}
	}

}
