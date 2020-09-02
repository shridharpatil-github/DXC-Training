package com.stackroute.keepnote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.service.NoteService;

@RestController

@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/api/v2/note")
public class NoteController {
	
	@Autowired
	private NoteService noteService;
	
	
	@PostMapping("/addNote")
	public Note addNote(@RequestBody Note note)
	{
		noteService.addNote(note);
		return note;
	}
	
	@GetMapping("/getNotes")
	public List<Note> getNotes()
	{
		return noteService.getAllNotes();
	}

}
