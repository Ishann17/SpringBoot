package com.code.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.model.Tourist;

public interface TouristRepository extends JpaRepository<Tourist, Integer> {

}
