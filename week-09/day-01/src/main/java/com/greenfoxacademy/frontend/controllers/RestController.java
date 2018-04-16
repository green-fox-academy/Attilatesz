package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.models.Appendable;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping(value = "/doubling")
  public Object doublingControll(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new NumberInt(input);
    } else {
      return new ErrorModel("Please provide an input!");
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeterController(@RequestParam(value = "name", required = false) String name,
                                  @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorModel("Please provide a name!");
    } else if (title == null) {
      return new ErrorModel("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object appendController(@PathVariable(name = "appendable") String wordToAppend) {
    return new Appendable(wordToAppend);
  }
}
