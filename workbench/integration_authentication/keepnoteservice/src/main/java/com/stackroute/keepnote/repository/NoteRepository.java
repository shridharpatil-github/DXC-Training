package com.stackroute.keepnote.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.keepnote.model.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note, Object> {
	
	

}
