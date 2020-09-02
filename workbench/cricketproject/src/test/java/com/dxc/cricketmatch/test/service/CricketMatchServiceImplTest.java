package com.dxc.cricketmatch.test.service;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.dxc.cricketmatch.model.NewMatch;
import com.dxc.cricketmatch.repository.CricketMatchRepository;
import com.dxc.cricketmatch.service.CricketMatchServiceImpl;

/**
 * @author Paartha
 *
 */
public class CricketMatchServiceImplTest {
	private NewMatch newMatch;
	
	@Mock
	private CricketMatchRepository cricketMatchRepository;
	
	@InjectMocks
	private CricketMatchServiceImpl cricketMatchServiceImpl;
	
	private List<NewMatch> newMatchesList=null;
	Optional<NewMatch> options;
	
	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		
		/*We can initiialize mock by calling initMocks method of
		  org.mockito.MockitoAnnotations
		  */
		
		MockitoAnnotations.initMocks(this);
		 Date today = Calendar.getInstance ().getTime ();
		 List<String> email = new ArrayList<>();
		 email.add("jon@dxc.com");
		newMatch=new NewMatch();
		newMatch.setMatchId(11111);
		newMatch.setTeam1("England");
		newMatch.setTeam2("NZ");
		newMatch.setDate(today);
		newMatch.setMatchStarted(true);
		newMatch.setToss_winner_team("England");
		newMatch.setType("Test");
		newMatch.setWinner_team("England");
		newMatch.setEmail(email);
		
		newMatchesList=new ArrayList<>();
		newMatchesList.add(newMatch);
		options=Optional.of(newMatch);
		
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void addToRecommendedTestSuccess() throws Exception{
		
		when(cricketMatchRepository.insert((NewMatch)any())).thenReturn(newMatch);
		Boolean addedMatch=cricketMatchServiceImpl.addToRecommended(newMatch);
		assertEquals(newMatch.getTeam1()!=null,addedMatch);
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void unrecommendMatch() throws Exception {
	when(cricketMatchRepository.findById(newMatch.getMatchId())).thenReturn(options);	
	boolean flag=cricketMatchServiceImpl.unrecommendMatch(newMatch.getMatchId(),newMatch.getEmail().toString());
	System.out.println(flag);
	assertTrue(true);
	
		
	}
	
}