package com.greenfoxacademy.listingtodo.repositories;

import com.greenfoxacademy.listingtodo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
