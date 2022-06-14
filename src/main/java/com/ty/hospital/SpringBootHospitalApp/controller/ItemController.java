package com.ty.hospital.SpringBootHospitalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.SpringBootHospitalApp.Dto.Item;
import com.ty.hospital.SpringBootHospitalApp.service.ItemService;


@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;



	@PostMapping("/medorder/{orderid}/item")
	public Item saveItem1(@PathVariable(name = "orderid") int mid, @RequestBody Item item) {

		return itemService.saveItem(mid, item);

	}

	

	@GetMapping("/getitem")
	public Item getItem(@RequestParam int id) {

		return itemService.getItem(id);

	}



	@GetMapping("/allitem")
	public List<Item> allItem() {
		return itemService.getAllItem();
	}



	@DeleteMapping("/deleteitem")
	public void removeItem(@RequestParam int id) {
		itemService.removeItem(id);
	}


	@PutMapping("/updateItem")
	public Item updateEncounter(@RequestParam int id, @RequestBody Item item) {

		return null;
	}

}
