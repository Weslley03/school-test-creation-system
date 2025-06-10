package com.weftecnologia.school_test_creation_system.entities;

public class ProvaHaveQuestions {

  private Long id;
  private Long provaId;
  private Long questionId;

  // Getters and Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getProvaId() {
    return provaId;
  }

  public void setProvaId(Long provaId) {
    this.provaId = provaId;
  }

  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }
}
