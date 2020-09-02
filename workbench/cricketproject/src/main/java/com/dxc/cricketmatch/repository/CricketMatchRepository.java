package com.dxc.cricketmatch.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.cricketmatch.model.NewMatch;

/**
 * @author Debayan
 * CricketMatchRepo is interface extends MongoRepository 
 * specific {@link org.springframework.data.repository.Repository} interface.
 * provides all CRUD related methods
 */
@Repository
public interface CricketMatchRepository extends MongoRepository<NewMatch, Long> {
}
