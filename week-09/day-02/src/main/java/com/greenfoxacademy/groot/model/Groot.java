package com.greenfoxacademy.groot.model;

public class Groot {
  private String recieved;
  private String translated;

  public Groot(String recieved) {
    this.recieved = recieved;
    translated = "I am Groot!";
  }

  public String getRecieved() {
    return recieved;
  }

  public void setRecieved(String recieved) {
    this.recieved = recieved;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
