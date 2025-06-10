package com.weftecnologia.school_test_creation_system.dtos;

import java.util.List;

public class CreateProvaDTO {
  
  private String fileName;
	private List<Integer> selectedQuestions;
	private boolean showSorce;
	private boolean showSubject;
	private boolean showTypeOfTeaching;
  private boolean showType;
	private boolean showDifficultyLevel;

  public CreateProvaDTO(
    String fileName, List<Integer> selectedQuestions,
    boolean showSorce, boolean showSubject, 
    boolean showTypeOfTeaching, boolean showType,
    boolean showDifficultyLevel
  ) {
    this.fileName = fileName;
    this.selectedQuestions = selectedQuestions;
    this.showSorce = showSorce;
    this.showSubject = showSubject;
    this.showTypeOfTeaching = showTypeOfTeaching;
    this.showType = showType;
    this.showDifficultyLevel = showDifficultyLevel;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public List<Integer> getSelectedQuestions() {
    return selectedQuestions;
  }

  public void setSelectedQuestions(List<Integer> selectedQuestions) {
    this.selectedQuestions = selectedQuestions;
  }

  public boolean isShowSorce() {
    return showSorce;
  }

  public void setShowSorce(boolean showSorce) {
    this.showSorce = showSorce;
  }

  public boolean isShowSubject() {
    return showSubject;
  }

  public void setShowSubject(boolean showSubject) {
    this.showSubject = showSubject;
  }

  public boolean isShowTypeOfTeaching() {
    return showTypeOfTeaching;
  }

  public void setShowTypeOfTeaching(boolean showTypeOfTeaching) {
    this.showTypeOfTeaching = showTypeOfTeaching;
  }

  public boolean isShowType() {
    return showType;
  }

  public void setShowType(boolean showType) {
    this.showType = showType;
  }

  public boolean isShowDifficultyLevel() {
    return showDifficultyLevel;
  }

  public void setShowDifficultyLevel(boolean showDifficultyLevel) {
    this.showDifficultyLevel = showDifficultyLevel;
  }
}
