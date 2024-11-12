package com.code.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code.model.Customer;

@Service
public interface CustomerService {
	
	List<Customer> getAllCustomers();
	Customer saveCustomer(Customer customer);
	Customer updateCustomer(Integer id);
	void deleteCustomer(int id);
}
