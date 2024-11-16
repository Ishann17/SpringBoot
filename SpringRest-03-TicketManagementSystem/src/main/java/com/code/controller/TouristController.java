package com.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.model.Tourist;
import com.code.service.TouristManagementService;

@RestController
@RequestMapping("/tourist")
public class TouristController {
	
	@Autowired
	private TouristManagementService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> registerNewTourist(@RequestBody Tourist tourist){
			
			String newTourist = service.saveNewTourist(tourist);
			return new ResponseEntity<String>(newTourist, HttpStatus.OK);
			
		
	}
	
	@GetMapping("/findall")
	public ResponseEntity<?> listOfTourists(){

			List<Tourist> allTourists = service.findAllTourists();
			
			return new ResponseEntity<List<Tourist>>(allTourists, HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<?> findTourist(@PathVariable Integer id){
	
			Tourist tourists = service.findByIdTourist(id);
			
			return new ResponseEntity<Tourist>(tourists, HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<?> updateTourist(@RequestBody Tourist tourist){
			
			String updateTourist = service.updateTourist(tourist);
			
			return new ResponseEntity<String>(updateTourist, HttpStatus.OK);
			
	}
	
	@PatchMapping("/budget/{id}/{hike}")
	public Tourist updateBudgetById(@PathVariable Integer id, @PathVariable Float hike){

			Tourist tourist = service.updateBudgetById(id, hike);
			return tourist;

	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTouristById(@PathVariable Integer id){
		
		String msg = null;
		
			service.deleteById(id);
			msg = "Tourist deleted with ID :: " + id;
			return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
