package com.weftecnologia.school_test_creation_system.controllers;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weftecnologia.school_test_creation_system.dtos.CreateQuestionDTO;
import com.weftecnologia.school_test_creation_system.entities.Question;
import com.weftecnologia.school_test_creation_system.services.QuestionService;

@RestController
@RequestMapping("/api")
public class QuestionController {
  
  private final QuestionService questionService;

  public QuestionController(QuestionService questionService) {
    this.questionService = questionService;
  }

  @PostMapping("/create")
  public ResponseEntity<String> create(@RequestBody CreateQuestionDTO dto) {
    try {
      questionService.saveQuestion(dto);
      return ResponseEntity.ok("operation successfully."); 
    } catch (IOException err) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body("Failed to question create, error: " + err.getMessage() + err);
    }
  }

  @GetMapping("{id}")
  public ResponseEntity<Question> finById(@PathVariable long id) {
    try {
      Question question = questionService.findById(id);
      if (question == null) ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      return ResponseEntity.ok(question); 
    } catch (IOException err) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(null);
    }
  }
}
