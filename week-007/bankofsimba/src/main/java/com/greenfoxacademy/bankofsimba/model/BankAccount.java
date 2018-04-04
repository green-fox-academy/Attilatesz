package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean isHeKing;
  private String whatIsHe;

  public BankAccount(String name, double balance, String animalType, String currency, boolean isHeKing, String whatIsHe) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.isHeKing = isHeKing;
    this.whatIsHe = whatIsHe;
  }

  public String getWhatIsHe() {
    return whatIsHe;
  }

  public void setWhatIsHe(String whatIsHe) {
    this.whatIsHe = whatIsHe;
  }

  public boolean isHeKing() {
    return isHeKing;
  }

  public void setHeKing(boolean heKing) {
    isHeKing = heKing;
  }



  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
