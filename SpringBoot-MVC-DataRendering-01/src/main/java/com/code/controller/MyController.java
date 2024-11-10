package com.code.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.code.model.Employee;


@Controller
public class MyController {

	@GetMapping
	public String showWelcome() {
		return "welcome";
	}
	
	@GetMapping("/details")
	public String showDetails(Map<String, Object> model) {
		
		String name = "Ishan Singh";
		int age = 27;
		String company = "Accenture";
		
		model.put("name", name);
		model.put("company", company);
		model.put("age", age);
		
		String[] country = {"India", "China", "USA", "UK", "Italy"};
		model.put("country", country);
		
		List<String> subjectList = List.of("Maths", "Chemistry", "Biology","English", "Hindi");
		model.put("subjects", subjectList);
		
		Set<Long> accountSet = Set.of(54548L,78656L,32145L, 61975L,57891L);
		model.put("accounts", accountSet);
		
		Map<String, Integer> userMap = Map.of("Adhar", 3214, "VoterID", 55511, "Age", 19);
		model.put("user", userMap);
		
		return "details";
	}
	
	@GetMapping("/employee")
	public String getEmployeeDetails(Map<String, Object> model) {
		
		Employee e1 = Employee.builder()
						.id(1)
						.name("Ishan")
						.city("Dehradun")
						.dept("SDE")
						.salary(98750.25).build();
		
		Employee e2 = Employee.builder()
				.id(3)
				.name("Gautam")
				.city("Meerut")
				.dept("HR")
				.salary(66750.75).build();
		
		Employee e3 = Employee.builder()
				.id(2)
				.name("Vishal")
				.city("Haridwar")
				.dept("Finance")
				.salary(75750.14).build();
		
		//List.of() creates a m=immutable list if try to sort it we will get UnsupportedOperationException
		//List<Employee> employeeList = List.of(e3, e2, e1);
		
		 List<Employee> employeeList = new ArrayList();
		    employeeList.add(e3);
		    employeeList.add(e1);
		    employeeList.add(e2);
		
		
		
		employeeList.sort(Comparator.comparingInt(Employee::getId));
		
		Employee e4 = Employee.builder()
				.id(5)
				.name("Muskan")
				.city("Lucknow")
				.dept("Strategy & Operations")
				.salary(108750.25).build();
		
		model.put("singleEmp", e4);
		
		
		model.put("employees", employeeList);
		return "employee";
	}
	
	
}
