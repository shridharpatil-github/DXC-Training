package com.dxc.item.controller;


import java.awt.geom.CubicCurve2D;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.item.model.Item;
import com.dxc.item.service.ItemService;

@RestController
@RequestMapping("/item/api")
public class ItemController {

	
	@Autowired
	private ItemService service;
	
	@PostMapping("/addItem")
	public ResponseEntity<?> addItem(@RequestBody Item item){
		
		if (service.addItem(item)) {
			return new ResponseEntity<String>("Item Added",HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("Item Not Added",HttpStatus.NOT_ACCEPTABLE);
	}
	@GetMapping("/getAllItems")
	public List<Item> getAllItems(){
		List<Item> items = service.getAllItems();
		return items;
	}
	
	@GetMapping("/getItemById")
	public Item getItemByid(@PathVariable int id) {
		
		Item item = service.getItemById(id);
		if(item!=null) {
			return item;
		}
		return null;
	}
	@DeleteMapping("/deleteItem/{itemId}")
	public ResponseEntity<?> deleteItem(@PathVariable int itemId) {
		
		if (service.deleteItem(itemId)) {
			return new ResponseEntity<String>("Item Deleted!!",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Item not Deleted!!",HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/update/{itemId}")
	public ResponseEntity<?> updateItemDetails(@PathVariable int itemId,@RequestBody Item item){
		
		if (service.update(itemId, item) != null) {
			return new ResponseEntity<String>("Items Updated!!",HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("Item Not Found",HttpStatus.NOT_FOUND);
	}
	
}
