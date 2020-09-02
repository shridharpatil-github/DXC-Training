package com.dxc.cricketmatch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * NewMatch class is model class 
 * it is holding data related to
 * New Cricket Match, it contains 
 * all new match related data members ,
 * setter and getters method for all 
 * data members and default constructor
 */
@Document
public class CricketMatch {
	
	@Id
	private int id;
	private String team1;
	private String team2;
	private boolean matchStarted;
	private String toss_winner_team;
	private String type;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public boolean isMatchStarted() {
		return matchStarted;
	}
	public void setMatchStarted(boolean matchStarted) {
		this.matchStarted = matchStarted;
	}
	public String getToss_winner_team() {
		return toss_winner_team;
	}
	public void setToss_winner_team(String toss_winner_team) {
		this.toss_winner_team = toss_winner_team;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
