package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {
  AtomicLong atomicLong = new AtomicLong(0);

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam ("name") String content){
    return new Greeting(atomicLong.addAndGet(1), "Hello, " + content + "!");
  }

  @RequestMapping(value = "/hello")
  public String hello(){
    return "Hello World";
  }
}
