package com.cg.ja18.onlinepizzaapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;





@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(OrderIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleDepartmentNotFoundException(OrderIdNotFoundException ex,WebRequest request) 
	{
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}
	
	@ExceptionHandler(CouponIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleDepartmentNotFoundException(CouponIdNotFoundException ex,WebRequest request) 
	{
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}
	
	
	@ExceptionHandler(InvalidCouponOperationException.class)
	public ResponseEntity<ErrorMessage> handleDepartmentNotFoundException(InvalidCouponOperationException ex,WebRequest request) 
	{
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}
	
	@ExceptionHandler(PizzaIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handlePizzaNotFoundException(PizzaIdNotFoundException ex,WebRequest request) 
	{
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}
	
	@ExceptionHandler(InvalidMinCostException.class)
	public ResponseEntity<ErrorMessage> handleMinCostException(InvalidMinCostException ex,WebRequest request) 
	{
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
		
	}
	
}
