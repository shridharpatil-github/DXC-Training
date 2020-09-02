package com.dxc.cricketmatch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.cricketmatch.model.CricketMatch;
import com.dxc.cricketmatch.repo.CricketMatchRepo;

/*
 * In this Class implementing all the methods,which are methods declared in CricketService interface
 * and we can write some business logic code also.
 * 
 */

@Service
public class CricketMatchServiceImpl implements CricketMatchService{

	@Autowired
	private CricketMatchRepo repo;
	
	@Override
	public List<CricketMatch> getAllNewMatches() {
		return repo.findAll();
	}

	@Override
	public boolean addNewMatch(CricketMatch newMatch) {
		repo.save(newMatch);
		return true;
	}

	@Override
	public CricketMatch getNewMatchById(int id) {
		CricketMatch newMatch = repo.findById(id).get();
		return newMatch;
	}

	@Override
	public CricketMatch updateMatchDetailsById(int id, CricketMatch newMatch) {
		Optional<CricketMatch> matchInfoPresent = repo.findById(id);
		if(matchInfoPresent.isPresent()) {
			newMatch.setId(id);
			repo.save(newMatch);
			return newMatch;
		}
		return null;
	}

	@Override
	public boolean deleteNewMatchById(int id) {
		 CricketMatch match = getNewMatchById(id);
		 if(match != null) {
			 repo.deleteById(id);
			 return true;
		 }
		 return false;
	}

}
