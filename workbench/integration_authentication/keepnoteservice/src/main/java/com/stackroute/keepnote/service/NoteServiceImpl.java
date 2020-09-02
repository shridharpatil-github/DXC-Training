package com.stackroute.keepnote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {

	
	@Autowired
	private NoteRepository noteRepository;
	
	@Override
	public Note addNote(Note note) {
		noteRepository.save(note);
		return note;
	}

	@Override
	public List<Note> getAllNotes() {
		return noteRepository.findAll();
	}

}
