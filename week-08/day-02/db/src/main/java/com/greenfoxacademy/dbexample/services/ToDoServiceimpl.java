package com.greenfoxacademy.dbexample.services;
import com.greenfoxacademy.dbexample.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceimpl implements ToDoService {

  @Autowired
  ToDoRepository toDoRepository;

  @Override
  public void deleteToDo(Long id) {
    toDoRepository.deleteById(id);
  }

  @Override
  public void changeIsDone(Long id) {
    toDoRepository.findById(id).get().setDone(true);
  }
}
