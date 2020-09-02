package com.dxc.cricketmatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.cricketmatch.model.CricketMatch;
import com.dxc.cricketmatch.service.CricketMatchService;

/*
 * This is Controller Class using @RestController makes class as a Controller class
 * using @RequestMapping we can handle the request and it will maps to specific class.
 * In this Controller Contains 5 methods
 * 1. addMatch() : returns ResponseEntity type, if added setting status ok, else not added set the status not acceptable
 * 2. getMatchById(int id) : return NewMatch type, if id present in database it will return NewMatch object
 * otherwise it will return null.
 * 3. getAllNewMatches() : return List of All matches
 * 4.updateMatchDetailsById(int id,NewMatch newMatch) : it will accept two arguments, id for find the match
 * newMatch object contains toUpdate the details, and it will return Object type NewMatch 
 * 5.deleteNewMatchById(int id) : it will acept one argument to find target object and by id it will delete 
 * match details from database , return ResponseEntity type.
 * 
 * 
 */


@RestController
@RequestMapping("/cricketmatch/api")
public class CricketMatchController {

	@Autowired
	private CricketMatchService service;
	
	@PostMapping("/addNewMatch")
	public ResponseEntity<?> addMatch(@RequestBody CricketMatch newMatch){
		
		if(service.addNewMatch(newMatch)) {
			return new ResponseEntity<String>("Match Added",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Not Added", HttpStatus.NOT_ACCEPTABLE);
		
	}
	
	@GetMapping("/getMatchById/{id}")
	public CricketMatch getMatchById(@PathVariable int id) {
		return service.getNewMatchById(id);
	}
	
	@GetMapping("/getAllMatches")
	public List<CricketMatch> getAllNewMatches(){
		return service.getAllNewMatches();
	}
	
	@PutMapping("/updateMatchDetailsById/{id}")
	public CricketMatch updateMatchDetailsById(@PathVariable int id, @RequestBody CricketMatch newMatch) {
		return service.updateMatchDetailsById(id, newMatch);
	}
	
	@DeleteMapping("deleteMatchById/{id}")
	public ResponseEntity<?> deleteMatchById(@PathVariable int id){
		
		if(service.deleteNewMatchById(id)) {
			return new ResponseEntity<String>("Match deleted",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Match not deleted",HttpStatus.NOT_FOUND);
	}
}
