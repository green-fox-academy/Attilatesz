package com.greenfoxacademy.listingtodo.controllers;

//Create a new controller called TodoController which maps to /todo
//        Add a single public String list(Model model) method which maps to / and /list in the controller, which returns with "This is my first todo" string. Use the @Responsebody annotation.
//        Run the application. If all works fine, we can go ahead.

import com.greenfoxacademy.listingtodo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class ToDoController {

@Autowired
ToDoRepository toDoRepository;

  @GetMapping(value = {"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", toDoRepository.findAll());
    return "todo";
  }
}
