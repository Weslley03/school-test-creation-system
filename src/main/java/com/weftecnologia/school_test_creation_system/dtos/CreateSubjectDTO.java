package com.weftecnologia.school_test_creation_system.dtos;

import com.weftecnologia.school_test_creation_system.entities.TypeOfTeaching;

public class CreateSubjectDTO {

  private String name;
  private TypeOfTeaching typeOfTeaching;
  private int createdByIdUser;

  public CreateSubjectDTO() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypeOfTeaching getTypeOfTeaching() {
    return typeOfTeaching;
  }

  public void setTypeOfTeaching(TypeOfTeaching typeOfTeaching) {
    this.typeOfTeaching = typeOfTeaching;
  }

  public int getCreatedByIdUser() {
    return createdByIdUser;
  }

  public void setCreatedByIdUser(int createdByIdUser) {
    this.createdByIdUser = createdByIdUser;
  }
}
