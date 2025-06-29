package com.weftecnologia.school_test_creation_system.entities;

public enum DifficultyLevel {
  EASY("Dificuldade fácil"),
  MEDIUM("Dificuldade média"),
  HARD("Dificuldade difícil");

  private final String label;

  DifficultyLevel(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}