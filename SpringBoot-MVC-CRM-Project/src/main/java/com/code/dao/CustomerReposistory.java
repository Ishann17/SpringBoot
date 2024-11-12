package com.code.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.model.Customer;

public interface CustomerReposistory extends JpaRepository<Customer, Integer> {

}
