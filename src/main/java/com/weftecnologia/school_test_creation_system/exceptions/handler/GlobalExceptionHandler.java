package com.weftecnologia.school_test_creation_system.exceptions.handler;

import java.io.IOException;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.weftecnologia.school_test_creation_system.exceptions.FileNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

  private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler(FileNotFoundException.class)
  public ResponseEntity<String> handleQuestionNotFound(FileNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
  }

  @ExceptionHandler(IOException.class)
  public ResponseEntity<String> handleIOException(IOException ex) {
    logger.error("IOException occurred: {}", ex.getMessage(), ex);
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error reading file.");
  }
}
