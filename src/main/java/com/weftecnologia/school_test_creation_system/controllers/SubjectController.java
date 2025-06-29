package com.weftecnologia.school_test_creation_system.controllers;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weftecnologia.school_test_creation_system.dtos.CreateSubjectDTO;
import com.weftecnologia.school_test_creation_system.services.SubjectService;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {

  private final SubjectService subjectService;

  public SubjectController(SubjectService subjectService) {
    this.subjectService = subjectService;
  }

  @PostMapping("/create")
  public ResponseEntity<String> create(@RequestBody CreateSubjectDTO dto) throws IOException {
    this.subjectService.saveSubject(dto);
    return ResponseEntity.ok("operation successfully.");
  }
}
