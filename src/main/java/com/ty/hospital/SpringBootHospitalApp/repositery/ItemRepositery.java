package com.ty.hospital.SpringBootHospitalApp.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospital.SpringBootHospitalApp.Dto.Item;


public interface ItemRepositery extends JpaRepository<Item, Integer> {

}
