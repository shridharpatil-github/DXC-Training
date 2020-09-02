package com.dxc.cricketmatch.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.cricketmatch.model.CricketMatch;
/*
 * CricketMatchRepo is interface it is extending MongoRepository interface
 * by extending this interface we can perform all CRUD operations
 * 
 * 
 */

@Repository
public interface CricketMatchRepo extends MongoRepository<CricketMatch, Integer> {
}
