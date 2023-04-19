package com.progetto.gestioneprenotazioni.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class InfoLanguageExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(LanguageNotFound.class)
	ResponseEntity<String> manageLanguageError(LanguageNotFound e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}