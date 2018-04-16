package com.greenfoxacademy.dbexample.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @Id
  private String name;
  private String email;

  @OneToMany(mappedBy = "assignee")
  private List<Todo>todoList = new ArrayList<>();

  public Assignee() {
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    this.todoList = todoList;
  }

  public void addTodo(Todo todo){
    this.todoList.add(todo);

  }

  public List<Todo> getTodoList() {
    return todoList;
  }

  public void setTodoList(List<Todo> todoList) {
    this.todoList = todoList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
