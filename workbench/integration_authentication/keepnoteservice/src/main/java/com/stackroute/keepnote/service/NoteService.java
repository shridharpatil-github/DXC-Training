package com.stackroute.keepnote.service;

import java.util.List;

import com.stackroute.keepnote.model.Note;

public interface NoteService {

	  public Note addNote(Note note);
	  public List<Note> getAllNotes();
	  
}
