package com.dxc.item.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.item.model.Item;
import com.dxc.item.repo.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepo repo;
	
	@Override
	public boolean addItem(Item item) {
		repo.save(item);
		return true;
	}

	@Override
	public boolean deleteItem(int itemId) {
		repo.deleteById(itemId);
		return true;
	}

	@Override
	public boolean updateItem(int itemId,Item item) {
	
		Item item2 = repo.findById(itemId).get();
		Optional<Item> it = repo.findById(itemId);
		if(it.isPresent()) {
//			it.ifPresent(it -> repo.save(item));
			repo.save(item);
			return true;
		}
		return false;
	}
	@Override
	public Item getItemById(int id) {
		return repo.findById(id).get();
	}
	@Override
	public Item update(int id, Item item) {
		Optional<Item> it = repo.findById(id);
		if(!it.isPresent()) {
			return null;
		}
		item.set_id(id);
		repo.save(item);
		return item;
	}

	@Override
	public List<Item> getAllItems() {
		
		return repo.findAll();
	}

}
