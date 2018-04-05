package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColorController {
  @Autowired
  UtilityService utilityService;

  @RequestMapping(value = "/useful")
  public String utilityController(){
    return "index";
  }
  @RequestMapping(value = "/useful/colored")
  public String coloredBackgroundController(Model model){
    model.addAttribute("color", utilityService.randomColor());
    return "randombg";
  }
}
