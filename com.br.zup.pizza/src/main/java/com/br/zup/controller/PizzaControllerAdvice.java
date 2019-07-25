package com.br.zup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.br.zup.exceptions.MessageNotFoundException;
import com.br.zup.helpers.DetailsErrors;

@RestController
@ControllerAdvice
public class PizzaControllerAdvice {
	
	@ExceptionHandler (MessageNotFoundException.class)
	public ResponseEntity<DetailsErrors> handlersMessageNotFoundException(MessageNotFoundException e, 
			WebRequest requisicao) {

		DetailsErrors detailsErrors = new DetailsErrors(HttpStatus.NOT_FOUND, requisicao.getDescription(false), 
				e.getMessage());
		return ResponseEntity.status(detailsErrors.getStatus()).body(detailsErrors);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<DetailsErrors> handleMethodArgumentNotValidException(MethodArgumentNotValidException e,
			WebRequest requisicao) {
		DetailsErrors detailsErrors = new DetailsErrors(HttpStatus.BAD_REQUEST, requisicao.getDescription(false),
				e.getMessage());
		return ResponseEntity.status(detailsErrors.getStatus()).body(detailsErrors);
	}
}
