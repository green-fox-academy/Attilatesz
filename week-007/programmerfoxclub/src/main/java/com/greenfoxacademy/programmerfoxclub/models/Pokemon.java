package com.greenfoxacademy.programmerfoxclub.models;

public class Pokemon {

  private String name;
  private String image;

  public Pokemon() {
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Pokemon(String name, String image) {
    this.name = name;
    this.image = image;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
