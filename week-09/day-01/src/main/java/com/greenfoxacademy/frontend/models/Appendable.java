package com.greenfoxacademy.frontend.models;

public class Appendable {
  private String appended;
  private String letter = "a";

  public Appendable(String wordToAppend) {
    this.appended = wordToAppend + letter;
  }

  public String getLetter() {
    return letter;
  }

  public void setLetter(String letter) {
    this.letter = letter;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String wordToAppend) {
    this.appended = wordToAppend;
  }
}
