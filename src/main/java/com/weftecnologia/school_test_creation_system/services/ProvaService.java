package com.weftecnologia.school_test_creation_system.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weftecnologia.school_test_creation_system.dtos.CreateProvaDTO;
import com.weftecnologia.school_test_creation_system.entities.Question;
import com.weftecnologia.school_test_creation_system.entities.Subject;

@Service
public class ProvaService {

  private final QuestionService questionService;
  private final SubjectService subjectService;

  public ProvaService(QuestionService questionService, SubjectService subjectService) {
    this.questionService = questionService;
    this.subjectService = subjectService;
  }

  private Subject getSubject(long subjectId) throws IOException {
    return this.subjectService.findById(subjectId);
  }

  public byte[] createProva(CreateProvaDTO dto) throws IOException {
    List<Question> questions = new ArrayList<>();

    for (Integer id : dto.getSelectedQuestions()) {
      questions.add(questionService.findById(id));
    }

    StringBuilder html = new StringBuilder();

    html.append("<!DOCTYPE html><html lang=\"pt-BR\"><head>");
    html.append("<meta charset=\"UTF-8\" /><title>").append(dto.getFileName()).append("</title>");
    html.append("<style> .questao { margin-bottom: 20px; } </style>");
    html.append("</head><body>");
    html.append("<h1>").append(dto.getFileName()).append("</h1>");

    int number = 1;
    for (Question q : questions) {
      html.append("<div class='questao'><div class='meta'>");

      List<String> metaParts = new ArrayList<>();
      if (dto.isShowSubject())
        metaParts.add(getSubject(q.getSubjectId()).getName());
      if (dto.isShowDifficultyLevel())
        metaParts.add(q.getDifficultyLevel().getLabel());
      if (dto.isShowType())
        metaParts.add(q.getTypeQuestion().getLabel());

      html.append("<strong>").append(String.join(" - ", metaParts)).append("</strong>");

      html.append("</div><div class='enunciado'>");
      html.append("<div>").append("<strong>").append(number++).append(") ").append("</strong>")
          .append(q.getHtmlQuestion()).append("</div>");
      html.append("</div></div>");
    }

    html.append("</body></html>");

    return html.toString().getBytes(StandardCharsets.UTF_8);
  }
}
