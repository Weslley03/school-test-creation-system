package com.weftecnologia.school_test_creation_system.entities;

import java.util.Date;

public class User {

  private int id;
  private String name;
  private String email;
  private String password;
  private boolean isAdm; 
  private Date createdAt;
  private Date updatedAt;

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

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isAdm() {
    return isAdm;
  }
  public void setIsAdm(boolean isAdm) {
    this.isAdm = isAdm;
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
}
