package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
          "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha",
          "Shalom", "Namaste", "Namaste", "Jó napot", "Halló",
          "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
          "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
          "Sawubona"};

  AtomicLong atomicLong = new AtomicLong(0);

  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model, @RequestParam("name") String content) {
    model.addAttribute("name", content);
    model.addAttribute("counter", atomicLong.addAndGet(1));
    return "greeting";
  }

  @RequestMapping(value = "/web/greetings")
  public String greetings(Model model, @RequestParam("name") String content) {
    model.addAttribute("name", content);
    model.addAttribute("greetings", hellos);
    return "anotherLanguegesGreetings";
  }

}
