package com.code.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
	
	private int id;
	private String name;
	private String city;
	private String dept;
	private Double salary;
	
	
}
