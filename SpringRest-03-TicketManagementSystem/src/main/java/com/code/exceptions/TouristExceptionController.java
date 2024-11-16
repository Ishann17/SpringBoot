package com.code.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TouristExceptionController {
	
	
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ExceptionDetails> touristNotFound(TouristNotFoundException te){
		
		ExceptionDetails details = new ExceptionDetails(LocalDateTime.now(),te.getMessage(),"404 - Tourist not found" );
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> globalExceptionHandler(Exception e){
		
		ExceptionDetails details = new ExceptionDetails(LocalDateTime.now(),e.getMessage(),"Internal Problem Occured." );
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.NOT_FOUND);
	}
	
	
}
