package com.dxc.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.book.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
