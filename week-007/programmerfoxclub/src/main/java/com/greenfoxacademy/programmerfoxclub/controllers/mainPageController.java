package com.greenfoxacademy.programmerfoxclub.controllers;
import com.greenfoxacademy.programmerfoxclub.factory.PokemonFactory;
import com.greenfoxacademy.programmerfoxclub.models.Pokemon;
import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepositoryImpl;
import com.greenfoxacademy.programmerfoxclub.temp.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class mainPageController {

  @Autowired
  UserRepositoryImpl userRepositoryImpl;
  @Autowired
  Database database;

  @RequestMapping(value = "/index")
  public String utilityController() {
    return "index";
  }

  @GetMapping(value = "/login")
  public String loginController() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String loginControllerWithParam(@ModelAttribute("username") String name) {
    return "redirect:/main?username=" + name;
  }

  @GetMapping(value = "/main")
  public String mainController(@RequestParam("username") String name, Model model) {
    User user = userRepositoryImpl.findOne(name);
    model.addAttribute("name", user.getName());
    model.addAttribute("image",user.getPokemon().getImage());
    return "main";
  }
}
