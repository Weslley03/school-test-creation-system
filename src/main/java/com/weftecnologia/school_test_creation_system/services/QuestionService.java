package com.weftecnologia.school_test_creation_system.services;

import com.weftecnologia.school_test_creation_system.daos.QuestionDAO;
import com.weftecnologia.school_test_creation_system.dtos.CreateQuestionDTO;
import com.weftecnologia.school_test_creation_system.entities.Question;
import com.weftecnologia.school_test_creation_system.util.IdGeneratorUtil;

import java.io.IOException;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  private final QuestionDAO questionDAO = new QuestionDAO();

  public void saveQuestion(CreateQuestionDTO dto) throws IOException {
    int id = IdGeneratorUtil.generateId();

    Question question = new Question();
    question.setId(id);
    question.setHtmlQuestion(dto.getHtmlQuestion());
    question.setDifficultyLevel(dto.getDifficultyLevel());
    question.setTypeQuestion(dto.getTypeQuestion());
    question.setSubjectId(dto.getSubjectId());
    question.setCreatedByIdUser(dto.getCreatedByIdUser());
    question.setIsActive(dto.isActive());

    Date now = new Date();
    question.setCreatedAt(now);
    question.setUpdatedAt(now);

    questionDAO.save(question);
  }

  public Question findById(long id) throws IOException {
    return questionDAO.findById(id);
  }
}
