package com.dxc.cricketmatch.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.any;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;

import com.dxc.cricketmatch.controller.CricketMatchController;
import com.dxc.cricketmatch.exception.MatchAlreadyExistException;
import com.dxc.cricketmatch.exception.MatchNotAddedException;
import com.dxc.cricketmatch.exception.MatchNotFoundException;
import com.dxc.cricketmatch.model.NewMatch;
import com.dxc.cricketmatch.service.CricketMatchService;
import com.fasterxml.jackson.databind.ObjectMapper;


//@SpringBootApplication
/**
 * @author Paartha
 *
 */

/*
 * The following annotation @WebMvcTest is to fire up an application context ( IOC )
 * that contains only the beans needed for testing a web controller
 * 
 */
@RunWith(SpringRunner.class)
@WebMvcTest(CricketMatchController.class)
public class CricketMatchControllerTest {

	@Autowired
	private MockMvc mockMvc; 
	private NewMatch newMatch;

	@MockBean
	private CricketMatchService cricketMatchService;

	@InjectMocks
	private CricketMatchController cricketMatchController;

	private List<NewMatch> newMatches;
	private List<String> email;

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(cricketMatchController).build();
		email = new ArrayList<String>();
		email.add("jon@dxc.com");
		newMatch=new NewMatch();
		newMatch.setMatchId(11111);
		newMatch.setDate(new Date());
		newMatch.setMatchStarted(true);
		newMatch.setTeam1("NZ");
		newMatch.setTeam2("india");
		newMatch.setToss_winner_team("india");
		newMatch.setType("test");
		newMatch.setEmail(email);
		newMatches=new ArrayList<NewMatch>();
		newMatches.add(newMatch);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void addToRecommendSuccess() throws Exception{

		when(cricketMatchService.addToRecommended(any())).thenReturn(true);
		mockMvc.perform(MockMvcRequestBuilders.post("/cricketmatch/api/recommededMatch")
				.contentType(MediaType.APPLICATION_JSON).content(asJsonString(newMatch)))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(MockMvcResultHandlers.print());
	}

	/**
	 * @throws MatchNotAddedException 
	 * @throws Exception
	 */
	@Test
	public void addToRecommendFailure() throws Exception{

		when(cricketMatchService.addToRecommended(any())).thenThrow(MatchAlreadyExistException.class);
		mockMvc.perform(MockMvcRequestBuilders.post("/cricketmatch/api/recommendedMatch")
				.contentType(MediaType.APPLICATION_JSON).content(asJsonString(newMatch)))
		.andExpect(MockMvcResultMatchers.status().isNotFound())
		.andDo(MockMvcResultHandlers.print());
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void getAllRecommendedMatches() throws Exception {
		when(cricketMatchService.getAllRecommendedNewMatches()).thenReturn(newMatches);
		mockMvc.perform(MockMvcRequestBuilders.get("/cricketmatch/api/getAllRecommeded")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(MockMvcResultHandlers.print());
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void unrecommendMatchSuccess() throws Exception {

//		when(cricketMatchService.unrecommendMatch(11111,"jon@dxc.com")).thenReturn(true);
//		mockMvc.perform(delete("cricketmatch/api/unrecommed/11111/jon@dxc.com")
//				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
//		.andDo(MockMvcResultHandlers.print());
		
		  when(cricketMatchService.unrecommendMatch(11111,"jon@dxc.com")).thenReturn(true);
	        mockMvc.perform(MockMvcRequestBuilders.delete("/cricketmatch/api/unrecommed/11111/jon@dxc.com")
	                .contentType(MediaType.APPLICATION_JSON))
	                .andExpect(MockMvcResultMatchers.status().isNotAcceptable())
	                .andDo(MockMvcResultHandlers.print());
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void unrecommendMatchFailure() throws Exception {

		when(cricketMatchService.unrecommendMatch(11111,"jon@dxc.com")).thenThrow(MatchNotFoundException.class);
		mockMvc.perform(MockMvcRequestBuilders.delete("/cricketmatch/api/unrecommed/11111/jon@dxc.com")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isNotAcceptable())
		.andDo(MockMvcResultHandlers.print());
	}



	private String asJsonString(NewMatch newMatch) {
		// TODO Auto-generated method stub
		try {
			return new ObjectMapper().writeValueAsString(newMatch);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}

	}

}