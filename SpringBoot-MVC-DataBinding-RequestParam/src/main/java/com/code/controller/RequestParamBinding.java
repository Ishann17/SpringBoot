package com.code.controller;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class RequestParamBinding {
	
	
	
	@GetMapping("/data")
	public String showDetails(Map<String, Object> model, @RequestParam("sid") int id, @RequestParam("sname") String name) {
		
		System.out.println("Id is :: " + id);
		System.out.println("Name is :: " + name);
		return "result";
		
		
		//URL::  http://localhost:9999/requestparam/data?sid=101&sname=Gopi
	}
	
	@GetMapping("/data1")
	public String showDetailsEmpty(Map<String, Object> model, @RequestParam int id, @RequestParam String name) {
		
		System.out.println("Id is :: " + id);
		System.out.println("Name is :: " + name);
		return "result";
		
		//URL :: http://localhost:9999/requestparam/data1?id=1017&name=Ishan
	}
	
	@GetMapping("/data2")
	public String showDetailsException(Map<String, Object> model, @RequestParam int id, @RequestParam(required = false) String name) {
		
		System.out.println("Id is :: " + id);
		System.out.println("Name is :: " + name);
		return "result";
		
		//URL :: http://localhost:9999/requestparam/data1?id=17
		//If we don't provide name in URL we will get MissingServletRequestParameterException, to avoid it we use @RequestParam(required = false)
	}
	
	
}
