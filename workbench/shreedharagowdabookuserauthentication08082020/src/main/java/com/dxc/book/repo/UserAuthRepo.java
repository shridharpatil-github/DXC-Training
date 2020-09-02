package com.dxc.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.book.model.User;

@Repository
public interface UserAuthRepo extends JpaRepository<User, String> {
}
