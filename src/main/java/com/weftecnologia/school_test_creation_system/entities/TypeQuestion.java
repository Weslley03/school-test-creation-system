package com.weftecnologia.school_test_creation_system.entities;

public enum TypeQuestion {
  MULTIPLE_CHOICE("Múltipla escolha"),
  SUMMATION("Dissertativa");

  private final String label;

  TypeQuestion(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
