package com.dxc.item.service;

import java.util.List;

import org.apache.catalina.startup.LifecycleListenerRule;

import com.dxc.item.model.Item;
//to achieve loosely couple
public interface ItemService {

	public boolean addItem(Item item);
	public boolean deleteItem(int itemId);
	public List<Item> getAllItems();
	public Item update(int id,Item item);
	public Item getItemById(int id);
}