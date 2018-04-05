package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    System.out.println(printer.log("It is red in color..."));
  }
}
