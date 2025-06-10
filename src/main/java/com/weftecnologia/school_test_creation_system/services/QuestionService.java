package com.weftecnologia.school_test_creation_system.services;

import com.weftecnologia.school_test_creation_system.daos.QuestionDAO;
import com.weftecnologia.school_test_creation_system.dtos.CreateQuestionDTO;
import com.weftecnologia.school_test_creation_system.entities.Question;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  private final QuestionDAO questionDAO = new QuestionDAO();
  private final Random random = new Random();

  private int generateId() {
    long timeStamp = System.currentTimeMillis();
    int randomSuffix = random.nextInt(1000);
    return (int)(timeStamp & Integer.MAX_VALUE) + randomSuffix;
  }

  public void saveQuestion(CreateQuestionDTO dto) throws IOException {
    int id = this.generateId();

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
