package com.weftecnologia.school_test_creation_system.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weftecnologia.school_test_creation_system.dtos.CreateProvaDTO;
import com.weftecnologia.school_test_creation_system.entities.Question;

@Service
public class ProvaService {

  private final QuestionService questionService;

  public ProvaService(QuestionService questionService) {
    this.questionService = questionService;
  }

  public byte[] createProva(CreateProvaDTO dto) throws IOException {
    List<Question> questions = new ArrayList<>();

    for (Integer id : dto.getSelectedQuestions()) {
      questions.add(questionService.findById(id));
    }

    StringBuilder html = new StringBuilder();

    html.append("<!DOCTYPE html><html lang=\"pt-BR\"><head>");
    html.append("<meta charset=\"UTF-8\" /><title>").append(dto.getFileName()).append("</title>");
    // html.append("<style> /* ... colar seu CSS aqui ... */ </style>");
    html.append("</head><body>");
    html.append("<h1>").append(dto.getFileName()).append("</h1>");

    int number = 1;
    for (Question q : questions) {
      html.append("<div class='questao'><div class='meta'>");

      // if (dto.isShowSubject())
      // html.append("<strong>").append(getSubject(q.getSubjectId())).append("</strong>");
      if (dto.isShowDifficultyLevel())
        html.append("<strong>").append(q.getDifficultyLevel().name()).append("</strong> ");
      if (dto.isShowType())
        html.append("<strong>").append(q.getTypeQuestion().name()).append("</strong>");

      html.append("</div><div class='enunciado'>");
      html.append("<strong>").append(number++).append(")</strong>");
      html.append("<div>").append(q.getHtmlQuestion()).append("</div>");
      html.append("</div></div>");
    }

    html.append("</body></html>");

    return html.toString().getBytes(StandardCharsets.UTF_8);
  }
}
