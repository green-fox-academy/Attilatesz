package com.greenfoxacademy.dbexample.repositories;

import com.greenfoxacademy.dbexample.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface ToDoRepository extends CrudRepository<Todo, Long> {
  @Query("select lower(c) from Todo c where c.title like %:title%")
  List<Todo> findTitle(@Param("title") String title);
}
