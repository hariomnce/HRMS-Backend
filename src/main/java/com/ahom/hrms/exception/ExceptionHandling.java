package com.ahom.hrms.exception;
import org.springframework.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
       @ExceptionHandler(MethodArgumentNotValidException.class)
       public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException e){
           Map<String, String> errorMap = new HashMap<>();
           e.getBindingResult().getFieldErrors().forEach(error ->{      
        	   errorMap.put(error.getField(), error.getDefaultMessage());
          });
           return errorMap;
      }
}
