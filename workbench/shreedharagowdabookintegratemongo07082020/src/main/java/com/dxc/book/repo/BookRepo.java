package com.dxc.book.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.book.model.Book;

@Repository
public interface BookRepo extends MongoRepository<Book, Integer>{
}
