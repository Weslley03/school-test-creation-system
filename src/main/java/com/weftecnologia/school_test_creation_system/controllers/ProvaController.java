package com.weftecnologia.school_test_creation_system.controllers;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weftecnologia.school_test_creation_system.dtos.CreateProvaDTO;
import com.weftecnologia.school_test_creation_system.services.ProvaService;

@RestController
@RequestMapping("/api/prova")
public class ProvaController {

  private final ProvaService provaService;

  public ProvaController(ProvaService provaService) {
    this.provaService = provaService;
  }

  @PostMapping("/create")
  public ResponseEntity<byte[]> createProva(@RequestBody CreateProvaDTO createProvaDTO) throws IOException {
    System.err.println(createProvaDTO);
    byte[] provaBytes = this.provaService.createProva(createProvaDTO);
    HttpHeaders headers = new HttpHeaders();
    // headers.setContentType(MediaType.APPLICATION_PDF);
    headers.setContentType(MediaType.TEXT_HTML);
    // headers.setContentDispositionFormData("attachment", "curriculum.pdf");
    headers.setContentDispositionFormData("attachment", "curriculum.html");

    return new ResponseEntity<>(provaBytes, headers, HttpStatus.OK);
  }
}
