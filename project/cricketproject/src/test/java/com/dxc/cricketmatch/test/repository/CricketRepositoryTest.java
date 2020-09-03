package com.dxc.cricketmatch.test.repository;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.NoSuchElementException;

import com.dxc.cricketmatch.model.NewMatch;
import com.dxc.cricketmatch.repository.CricketMatchRepository;

/**
 * @author Paartha
 *
 */
@SpringBootApplication
@RunWith(SpringRunner.class)
@DataMongoTest

@ComponentScan({"com.dxc.cricketmatch.*"})
@EntityScan("com.dxc.cricketmatch.*")
@EnableMongoRepositories("com.dxc.cricketmatch.*")
public class CricketRepositoryTest {
	
	@Autowired
	private CricketMatchRepository cricketMatchRepository;
	private NewMatch newMatch;

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
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
		
	}
	
	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception{
		cricketMatchRepository.deleteAll();
	}

	// 
	/**
	 * CREATE testcase for CRUD operation
	 */
	@Test
	public void addNewMatchTest()
	{
		// currently we are testing with the newMatch object initialised in the setUp method
		cricketMatchRepository.insert(newMatch);
		NewMatch fetchedNewMatch=cricketMatchRepository.findById(newMatch.getMatchId()).get();
		assertEquals(11111,fetchedNewMatch.getMatchId());
	}

	// DELETE testcase for CRUD operation 
	  /**
	 * 
	 */
	@Test(expected=NoSuchElementException.class)
	public void deleteNewMatchTest() {
		// 1) Inserting one record
		  cricketMatchRepository.insert(newMatch);
		// 2) Fetch the record to be deleted!!!!
		  NewMatch fetchedNewMatch=cricketMatchRepository.findById(newMatch.getMatchId()).get();
		assertEquals(11111,fetchedNewMatch.getMatchId());
		// 3) Delete the record!!!
		cricketMatchRepository.delete(fetchedNewMatch);
		fetchedNewMatch=cricketMatchRepository.findById(newMatch.getMatchId()).get();
	   }

	  /**
	 * 
	 */
	@Test
	   public void getNewMatchByIdTest()
	   {
		//1) Inserting the record
		  cricketMatchRepository.insert(newMatch);
		// 2) Fetch the record   
		  NewMatch fetchedNewMatch=cricketMatchRepository.findById(newMatch.getMatchId()).get();
		 // assert
		  assertEquals(11111,fetchedNewMatch.getMatchId());
	   }

}
