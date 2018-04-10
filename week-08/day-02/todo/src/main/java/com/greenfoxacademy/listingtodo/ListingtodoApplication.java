package com.greenfoxacademy.listingtodo;

import com.greenfoxacademy.listingtodo.model.ToDo;
import com.greenfoxacademy.listingtodo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodoApplication implements CommandLineRunner{

  @Autowired
  ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ListingtodoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
	  toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
	  toDoRepository.save(new ToDo("Sleeping"));
	  toDoRepository.save(new ToDo("Eating"));
	  toDoRepository.save(new ToDo("Running"));


  }
}
