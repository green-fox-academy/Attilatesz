package com.greenfoxacademy.groot.controllers;

import com.greenfoxacademy.groot.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping(value = "/groot")
  public ResponseEntity translater(@RequestParam(value = "message", required = false) String somemessage){
    if (somemessage == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Groot(somemessage));
    }
  }

  @GetMapping(value = "/yondu")
  public ResponseEntity speedCalculator(@RequestParam(value = "distance") double distance ,@RequestParam(value = "time") double time){
    return ResponseEntity.status(HttpStatus.OK).body(new Arrow(distance,time));
  }
}
