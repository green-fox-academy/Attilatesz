package com.greenfoxacademy.dbexample.repositories;

import com.greenfoxacademy.dbexample.models.Assignee;
import org.springframework.data.repository.CrudRepository;


public interface AssigneeRepository extends CrudRepository<Assignee, String> {
}
