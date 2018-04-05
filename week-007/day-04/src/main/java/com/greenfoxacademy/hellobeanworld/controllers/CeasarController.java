package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CeasarController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping(value = "/useful/decode")
  public String decoder(){
    return "decode";
  }

  @RequestMapping(value = "/useful/worddecoder")
  public String wordDecoder(Model model, @RequestParam("number") int number, @RequestParam("word") String word){
      model.addAttribute("decoded", utilityService.caesar(word,number));
    return "ceasardecoder";
  }
}
