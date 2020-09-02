package com.dxc.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.book.model.Book;
import com.dxc.book.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo repo;
	@Override
	public Book addBook(Book book) {
		repo.save(book);
		return book;
	}
	
	@Override
	public List<Book> getAllBooks() {
		return repo.findAll();
	}
	
}
