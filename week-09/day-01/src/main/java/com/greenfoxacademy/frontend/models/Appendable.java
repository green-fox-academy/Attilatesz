package com.greenfoxacademy.frontend.models;

public class Appendable {
  private String appended;

  public Appendable(String wordToAppend) {
    this.appended = wordToAppend + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String wordToAppend) {
    this.appended = wordToAppend;
  }
}
