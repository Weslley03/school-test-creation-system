package com.weftecnologia.school_test_creation_system.dtos;

import com.weftecnologia.school_test_creation_system.entities.DifficultyLevel;
import com.weftecnologia.school_test_creation_system.entities.TypeQuestion;

public class CreateQuestionDTO {
  
  private String htmlQuestion;
	private DifficultyLevel difficultyLevel; 
  private TypeQuestion typeQuestion;
  private int subjectId;
  private int createdByIdUser;
  private Boolean isActive;

  public CreateQuestionDTO(
    String htmlQuestion, DifficultyLevel difficultyLevel, 
    TypeQuestion typeQuestion, int subjectId, 
    int createdByIdUser, Boolean isActive
    ) {
    this.htmlQuestion = htmlQuestion;
    this.difficultyLevel = difficultyLevel;
    this.typeQuestion = typeQuestion;
    this.subjectId = subjectId;
    this.createdByIdUser = createdByIdUser;
    this.isActive = isActive;
  }

  public String getHtmlQuestion() {
    return htmlQuestion;
  }

  public void setHtmlQuestion(String htmlQuestion) {
    this.htmlQuestion = htmlQuestion;
  }

  public DifficultyLevel getDifficultyLevel() {
    return difficultyLevel;
  }

  public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
  }

  public TypeQuestion getTypeQuestion() {
    return typeQuestion;
  }

  public void setTypeQuestion(TypeQuestion typeQuestion) {
    this.typeQuestion = typeQuestion;
  }

  public int getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(int subjectId) {
    this.subjectId = subjectId;
  }

  public int getCreatedByIdUser() {
    return createdByIdUser;
  }

  public void setCreatedByIdUser(int createdByIdUser) {
    this.createdByIdUser = createdByIdUser;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
}
