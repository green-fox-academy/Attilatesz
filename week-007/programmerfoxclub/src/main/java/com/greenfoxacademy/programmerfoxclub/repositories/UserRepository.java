package com.greenfoxacademy.programmerfoxclub.repositories;
import com.greenfoxacademy.programmerfoxclub.models.User;
import org.springframework.stereotype.Component;


public interface UserRepository {

  User findOne(String username);

}