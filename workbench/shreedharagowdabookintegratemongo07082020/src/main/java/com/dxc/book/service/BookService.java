package com.dxc.book.service;

import java.util.List;

import com.dxc.book.model.Book;

public interface BookService {

	public Book addBook(Book book);
	public List<Book> getAllBooks();
}
