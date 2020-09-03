package com.dxc.cricketmatch.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.cricketmatch.user.model.User;

/**
 * @author Debayan
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
