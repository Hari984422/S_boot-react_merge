package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdminGlobalExceptionHandler {

	@ExceptionHandler(value = DataNotFoundException.class)
	ResponseEntity<DataNotFoundException> loginEx(DataNotFoundException e){
		return new ResponseEntity<DataNotFoundException>(e,HttpStatus.NOT_FOUND);
	}
}
