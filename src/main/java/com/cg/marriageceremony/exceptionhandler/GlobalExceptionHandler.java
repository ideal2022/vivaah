package com.cg.marriageceremony.exceptionhandler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.marriageceremony.response.ApiError;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> handle(Exception e){
		e.printStackTrace();
		ApiError error=new ApiError();
		error.setMsg(e.getMessage());
		ResponseEntity<ApiError> resEntity=new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		return resEntity;
	}
}
