package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class BankAccounts {

  DecimalFormat decimalFormat = new DecimalFormat("0.00");
  BankAccount Timon = new BankAccount("Timon", 1500, "Mongoose", "Insect",false, "Good Guy");
  BankAccount Pumba = new BankAccount("Pumba", 1000, "Boar", "Insect",false,"Good Guy");
  BankAccount Mufasa = new BankAccount("Mufasa", 5000, "Lion", "Zebra",true,"Good Guy");
  BankAccount Zordon = new BankAccount("Zordon", 500, "Lion", "Zebra",false,"Bad Guy");
  BankAccount Simba = new BankAccount("Simba", 2000.00, "Lion", "Zebra",true,"Good Guy");
  List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(Timon,Pumba,Mufasa,Zordon,Simba));


  @RequestMapping(value = "/showall")
  public String showBankAccounts(Model model){
    model.addAttribute("accounts", bankAccounts);
    return "showall";
  }
}
