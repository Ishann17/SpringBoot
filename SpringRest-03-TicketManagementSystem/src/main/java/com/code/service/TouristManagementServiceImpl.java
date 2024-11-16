package com.code.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.TouristRepository;
import com.code.exceptions.TouristNotFoundException;
import com.code.model.Tourist;

@Service
public class TouristManagementServiceImpl implements TouristManagementService {
	
	@Autowired
	private TouristRepository repository;
	
	@Override
	public String saveNewTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		Integer id = repository.save(tourist).getId();
		return "Tourist registered with Id :: " + id;
	}

	@Override
	public List<Tourist> findAllTourists() {
		List<Tourist> all = repository.findAll();
		
		all.sort((t1, t2) -> t1.getId().compareTo(t2.getId()));
		return all;
	}

	@Override
	public Tourist findByIdTourist(Integer id) {
		// TODO Auto-generated method stub
		Tourist tourist = repository.findById(id).orElseThrow(()-> new TouristNotFoundException("Tourist not found with id :: " + id));
		
		return tourist;
	}

	@Override
	public void deleteById(Integer id) {
		Optional<Tourist> optional = repository.findById(id);
		
		if(optional.isPresent()) {
			repository.deleteById(id);
			
		}
		else {
			throw new TouristNotFoundException("Tourist not found with id :: " + id);
		}

	}

	@Override
	public String updateTourist(Tourist tourist) {
		
		Optional<Tourist> optional = repository.findById(tourist.getId());
		
		if(optional.isPresent()) {
			repository.save(tourist);
			return "Tourist with id :: " + tourist.getId() + " updated.";
		}
		else {
			 throw new TouristNotFoundException("Tourist not found with id :: " + tourist.getId());
		}
		
	}

	@Override
	public Tourist updateBudgetById(Integer id, Float hike) {
				Tourist tourist = repository.findById(id).orElseThrow(()-> new TouristNotFoundException("Tourist Not found with id :: " + id));
				tourist.setPrice(tourist.getPrice() + hike);
		return tourist;
	}

}
