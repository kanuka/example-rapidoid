package org.example.myapp.domain;

import javax.persistence.Entity;

@Entity
public class DTodo extends BaseDomain {

  private String name;

  private String description;

  public DTodo(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
