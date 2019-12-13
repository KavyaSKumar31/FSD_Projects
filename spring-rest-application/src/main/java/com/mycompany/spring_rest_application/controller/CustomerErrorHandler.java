package com.mycompany.spring_rest_application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerErrorHandler {
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException cnfe) {

		
		
		CustomerErrorResponse error=new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(),
				cnfe.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleCustomerNotFoundException(Exception e) {

		
		
		CustomerErrorResponse error=new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(),
				e.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}

}
