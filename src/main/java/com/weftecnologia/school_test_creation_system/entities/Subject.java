package com.weftecnologia.school_test_creation_system.entities;

import java.util.Date;

public class Subject {
  
  private int id;
  private String name;
  private TypeOfTeaching typeOfTeaching; 
  private Date createdAt;
  private Date updatedAt;
  private int createdByIdUser;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
}
