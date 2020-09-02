package com.dxc.item.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.item.model.Item;
@Repository
public interface ItemRepo extends MongoRepository<Item, Integer>{
}
