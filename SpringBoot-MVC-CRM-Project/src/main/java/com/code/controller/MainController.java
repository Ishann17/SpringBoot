package com.code.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.Customer;
import com.code.service.CustomerService;

@Controller
public class MainController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/listCustomer")
	public String getListOfCustomers(Map<String, Object> model) {
		
		List<Customer> allCustomers = service.getAllCustomers();
		model.put("customers", allCustomers);
		return "list";
	}
	
	
	@GetMapping("/saveCustomer")
	public String showFormToSave() {
		
		return "save";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer customer,Map<String, Object> model) {
		
		Customer saveCustomer = service.saveCustomer(customer);
		
		model.put("savedCustomer", saveCustomer);
		return"savedCustomer";
	}
	
	@GetMapping("/updateCustomer")
	public String showUpdateForm(@RequestParam("id") int id, Map<String, Object> model) {
	    // Get customer by id and add to model
	    Customer customer = service.updateCustomer(id);
	    model.put("customer", customer);
	    return "update";
	}
	
	@PostMapping("/updateCustomer")
	public String updateCustomer(@ModelAttribute Customer customer) {
	    service.saveCustomer(customer);    // We can use the existing saveCustomer method
	    return "redirect:/listCustomer";   // After update, redirect to the list page
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("id") int id) {
	    service.deleteCustomer(id);
	    return "redirect:/listCustomer";
	}
	
}
