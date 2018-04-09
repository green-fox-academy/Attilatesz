package com.greenfoxacademy.programmerfoxclub.factory;
import com.greenfoxacademy.programmerfoxclub.models.Pokemon;
import com.greenfoxacademy.programmerfoxclub.models.User;

public class UserFactory {

    public User createUser(String username, Pokemon pokemon) {
      User user = new User(username, pokemon);
      return user;
    }
  }