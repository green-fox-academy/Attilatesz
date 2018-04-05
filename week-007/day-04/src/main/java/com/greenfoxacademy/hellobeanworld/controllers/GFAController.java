package com.greenfoxacademy.hellobeanworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GFAController {
  @RequestMapping(value = "/gfa")
  public String listStudents(){
    return "main";
  }
}
