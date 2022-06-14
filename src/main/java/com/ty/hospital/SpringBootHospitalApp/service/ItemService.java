package com.ty.hospital.SpringBootHospitalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.hospital.SpringBootHospitalApp.Dto.Item;
import com.ty.hospital.SpringBootHospitalApp.dao.ItemDao;
import com.ty.hospital.SpringBootHospitalApp.exception.NoIdFoundException;

@Service
public class ItemService {

	@Autowired
	private ItemDao dao;

	public Item saveItem(int id, Item item) {
		Item item2 = dao.saveItem(id, item);
		if (item2 == null) {
			throw new NoIdFoundException("Given MedOrder Id " + id + " Is Invalid ");
		}
		return item2;
	}

	public Item getItem(int id) {
		Item item = dao.getItemById(id);
		if (item == null) {
			throw new NoIdFoundException("Given Item Id " + id + " Is Not Valid");
		}
		return item;
	}

	public List<Item> getAllItem() {
		return dao.getAllitem();
	}

	public boolean removeItem(int id) {
		boolean b = dao.deleteItem(id);
		if (b) {
			return true;
		}
		throw new NoIdFoundException("Id Not Found");
	}
}
