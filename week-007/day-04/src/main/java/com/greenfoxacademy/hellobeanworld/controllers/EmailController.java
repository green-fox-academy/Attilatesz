package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
  @Autowired
  UtilityService utilityService;

  @RequestMapping(value = "/useful/email")
  public String emailMain(){
    return "email";
  }

  @RequestMapping(value = "/useful/emailchecker")
  public String emailController(Model model, @RequestParam ("email") String email){
    model.addAttribute("valid", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "validchecker";
  }
}
