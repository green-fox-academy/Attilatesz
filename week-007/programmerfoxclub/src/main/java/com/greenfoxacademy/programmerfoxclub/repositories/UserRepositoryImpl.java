package com.greenfoxacademy.programmerfoxclub.repositories;
import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.temp.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {

  @Autowired
  private Database database;

  public UserRepositoryImpl() {
  }

  @Override
  public User findOne(String username) {
    for (User user : database.USERS) {
      if (user.getName().equals(username)) {
        return user;
      }
    }
    return null;
  }
}