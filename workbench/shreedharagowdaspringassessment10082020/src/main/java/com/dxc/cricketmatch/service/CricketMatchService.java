package com.dxc.cricketmatch.service;

import java.util.List;

import com.dxc.cricketmatch.model.CricketMatch;
/*
 * in this declaring all the methods and all these methods will implements 
 * in CricketServiceImpl class, by writing code like this we can achieve loose 
 * coupling.
 * 
 */

public interface CricketMatchService {
	public List<CricketMatch> getAllNewMatches();
	public boolean addNewMatch(CricketMatch newMatch);
	public CricketMatch getNewMatchById(int id);
	public CricketMatch updateMatchDetailsById(int id,CricketMatch newMatch);
	public boolean deleteNewMatchById(int id);
	
}
