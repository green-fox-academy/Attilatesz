package com.greenfoxacademy.dbexample.controllers;

import com.greenfoxacademy.dbexample.models.Assignee;
import com.greenfoxacademy.dbexample.models.Todo;
import com.greenfoxacademy.dbexample.repositories.AssigneeRepository;
import com.greenfoxacademy.dbexample.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRepository;
  @Autowired
  ToDoRepository todtoDoRepository;


  @RequestMapping(value = "/todo/assignee")
  public String listOfAssignee(@RequestParam(value = "isActive", required = false) boolean isDone, Model model){
    model.addAttribute("assignees", assigneeRepository.findAll());
    model.addAttribute("todolist", todtoDoRepository.findAll());
    model.addAttribute("isActiveAss", isDone);
    return "assignee";
  }
  @GetMapping(value = "/todo/assignee/add")
  public String getAssignees(@RequestParam(value = "isActive", required = false) boolean isDone, Model model){
      model.addAttribute("todolist", todtoDoRepository.findAll());
      model.addAttribute("isActiveAss", isDone);
    return "addassignee";
  }
  @PostMapping(value = "/todo/assignee/add")
  public String makeAssignees(@ModelAttribute(value = "assignee") String name, String email) {
    assigneeRepository.save(new Assignee(name, email));
    return "redirect:/todo/assignee";
  }

  @PostMapping(value = "/todo/assignee")
  public void setAssigneeTodo(@ModelAttribute(value = "name") String name, @ModelAttribute("id") Long id) {
    Optional<Todo> todoToEdit = todtoDoRepository.findById(id);
    Optional<Assignee> newAssignee = assigneeRepository.findById(name);
    if (todoToEdit.isPresent() && newAssignee.isPresent()) {
      Todo todo = todoToEdit.get();
      Assignee assignee = newAssignee.get();
      todo.setAssignee(assignee);
      todtoDoRepository.save(todo);
    }
  }
}
