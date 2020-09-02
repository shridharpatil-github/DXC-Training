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
	public Item getItemById(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public Item update(int id, Item item) {
		Optional<Item> itemPresent = repo.findById(id);
		if(!itemPresent.isPresent()) {
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
