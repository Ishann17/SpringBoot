package com.code.service;

import java.util.List;

import com.code.model.Tourist;

public interface TouristManagementService {
	
	String saveNewTourist(Tourist tourist);
	List<Tourist> findAllTourists();
	Tourist findByIdTourist(Integer id);
	void deleteById(Integer id);
	String updateTourist(Tourist tourist);
	Tourist updateBudgetById(Integer id, Float hike);
	
}
