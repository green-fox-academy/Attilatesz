package com.greenfoxacademy.dbexample;

import com.greenfoxacademy.dbexample.models.Todo;
import com.greenfoxacademy.dbexample.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbexampleApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}