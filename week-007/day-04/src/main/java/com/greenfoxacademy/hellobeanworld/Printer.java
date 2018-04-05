package com.greenfoxacademy.hellobeanworld;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class Printer {
  public String log(String message) {
    return "Time: " + LocalDateTime.now() + " MY PRINTER SAYS --- " + message;
  }
}