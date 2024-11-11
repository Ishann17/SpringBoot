package com.code.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.code.model.Employee;


@Controller
public class EmployeeController {
	
	@GetMapping("/emp_register")
	public String showHome() {
		
		return "welcome";
	}
	
	
	@PostMapping("/emp_register")
	public String registerEmployeeDetails(Map<String, Employee> model,  @ModelAttribute("emp") Employee employee) {
		System.out.println("EmployeeController.registerEmployeeDetails()");
		
		System.out.println(employee);
		
		model.put("employee", employee);
		
		return "result";
	}
	
	
}
