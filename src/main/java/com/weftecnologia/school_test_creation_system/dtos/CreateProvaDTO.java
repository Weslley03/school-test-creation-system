package com.weftecnologia.school_test_creation_system.dtos;

import java.util.List;

public class CreateProvaDTO {

  private String fileName;
  private List<Integer> selectedQuestions;
  private boolean showSource;
  private boolean showSubject;
  private boolean showTypeOfTeaching;
  private boolean showType;
  private boolean showDifficultyLevel;

  public CreateProvaDTO() {
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

  public boolean isShowSource() {
    return showSource;
  }

  public void setShowSource(boolean showSource) {
    this.showSource = showSource;
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
