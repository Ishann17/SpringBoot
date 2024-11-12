package com.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.CustomerReposistory;
import com.code.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerReposistory reposistory;

	@Override
	public List<Customer> getAllCustomers() {
	
		List<Customer> customers = reposistory.findAll();
		return customers;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return reposistory.save(customer);
	}

	@Override
	public Customer updateCustomer(Integer id) {
		
		return reposistory.findById(id).get();
	}

	@Override
	public void deleteCustomer(int id) {
		
		reposistory.deleteById(id);
		
	}
}
