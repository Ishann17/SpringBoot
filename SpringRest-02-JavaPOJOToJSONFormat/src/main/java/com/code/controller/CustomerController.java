package com.code.controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.model.Company;
import com.code.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("/data/{id}")
	public ResponseEntity<Customer> showCustomerById(@PathVariable Integer id) {
		
		Customer customer = new Customer();
		
		System.out.println("Customer id :: " + id);
		customer.setId(id);
		customer.setName("Ishan Raghav");
		customer.setBillAmount(789.25f);
		customer.setTeams(new String[] {"CSK", "IND", "MI", "KRK"});
		customer.setCity(List.of("Dehradun", "Lucknow", "Delhi", "Noida", "Bengaluru"));
		customer.setPhNum(Set.of(48845131L, 75123484L, 98745611L));
		customer.setIdDetails(Map.of("Adhar Num", 87545, "PAN", 87541, "Voter ID", 12120));
		customer.setCompany(new Company("Google", "Technology", 55264));
		
		
		ResponseEntity<Customer> entity = new ResponseEntity<Customer>(customer, HttpStatus.OK);
		
		
		return entity;

	}
	
	
	@PostMapping("/save")
	public Customer saveNewCustomer(@RequestBody Customer customer) {
		
		Customer newCustomer = customer;
		
		System.out.println("Customer id :: " + customer.getId());
		System.out.println("Customer id :: " + customer.getName());
		System.out.println("Customer id :: " + customer.getBillAmount());
		System.out.println("Customer id :: " + customer.getCompany());
		
		System.out.println(newCustomer);
		
		return newCustomer;
	}
	
	
}
