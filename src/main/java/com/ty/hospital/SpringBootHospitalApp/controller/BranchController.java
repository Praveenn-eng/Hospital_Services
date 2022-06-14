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

import com.ty.hospital.SpringBootHospitalApp.Dto.Branch;
import com.ty.hospital.SpringBootHospitalApp.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	private BranchService branchService;

	@PostMapping("/hospital/{hospitalid}/branch")
	public Branch saveBranch(@PathVariable(name = "hospitalid") int id, @RequestBody Branch branch) {
		return branchService.saveBranch(id, branch);
	}

	@GetMapping("branch/{branchid}")
	public Branch getBranch(@PathVariable(name = "branchid") int bid) {
		return branchService.getBranch(bid);
	}

	@GetMapping("/allbranches")
	public List<Branch> allBranchs() {
		return branchService.getAllBranchs();
	}

	@DeleteMapping("/deletebranch")
	public void removeBranch(@RequestParam int id) {
		branchService.removeBranch(id);
	}

	@PutMapping("/updatebranchh")
	public Branch updateBranch(@RequestParam int id, @RequestBody Branch branch) {

		return null;
	}

}
