package com.code.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
public class Customer {
	
	
	private Integer id;
	private String name;
	private float billAmount;
	private String[] teams;
	private List<String> city;
	private Set<Long> phNum;
	private Map<String, Integer> idDetails;
	
	//HAS-Relationship
	private Company company;
}
