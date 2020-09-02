package com.dxc.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.book.model.Book;
import com.dxc.book.service.BookService;

@RestController
@RequestMapping("/book/api")
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		Book addedBook = service.addBook(book);
		if(addedBook != null) {
			return addedBook;
		}
		return null;
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks(){
		List<Book> books = service.getAllBooks();
		return books;
	}
}
