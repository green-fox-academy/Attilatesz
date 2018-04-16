package com.greenfoxacademy.dbexample.controllers;

//Create a new controller called TodoController which maps to /todo
//        Add a single public String list(Model model) method which maps to / and /list in the controller, which returns with "This is my first todo" string. Use the @Responsebody annotation.
//        Run the application. If all works fine, we can go ahead.

import com.greenfoxacademy.dbexample.models.Assignee;
import com.greenfoxacademy.dbexample.models.Todo;
import com.greenfoxacademy.dbexample.repositories.AssigneeRepository;
import com.greenfoxacademy.dbexample.repositories.ToDoRepository;
import com.greenfoxacademy.dbexample.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    ToDoRepository toDoRepository;
    @Autowired
    ToDoService toDoService;

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", toDoRepository.findAll());
        return "todo";
    }

    @GetMapping(value = "/add")
    public String toDoForm() {
        return "add";
    }

    @PostMapping(value = "/add")
    public String toDoSubmit(
            @ModelAttribute(value = "todotitle") String title) {
        toDoRepository.save(new Todo(title));
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable Long id) {
        toDoService.deleteToDo(id);
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/done")
    public String changeDone(@PathVariable Long id) {
        toDoService.changeIsDone(id);
        toDoRepository.save(toDoRepository.findById(id).get());
        return "redirect:/todo/list";
    }

    @PostMapping(value = "/search")
    public String findTitle(@ModelAttribute(name = "title") String title, Model model) {
        model.addAttribute("todos", toDoRepository.findTitle(title));
        return "todo";
    }

}
