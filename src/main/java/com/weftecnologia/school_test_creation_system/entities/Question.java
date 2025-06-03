package com.weftecnologia.school_test_creation_system.entities;

import java.util.Date;

public class Question {
  
  private int id;
  private String htmlQuestion;
  private DifficultyLevel difficultyLevel; 
  private TypeQuestion typeQuestion;
  private int subjectId;
  private Date createdAt;
  private Date updatedAt;
  private int createdByIdUser;
  private boolean isActive;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
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

  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public int getCreatedByIdUser() {
    return createdByIdUser;
  }
  public void setCreatedByIdUser(int createdByIdUser) {
    this.createdByIdUser = createdByIdUser;
  }

  public boolean isActive() {
    return isActive;
  }
  public void setIsActive(boolean isActive) {
    this.isActive = isActive;
  }
}
