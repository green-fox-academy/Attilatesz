package com.greenfoxacademy.programmerfoxclub.models;


public class User {

  private String name;
  private Pokemon pokemon;

  public User(String name, Pokemon pokemon) {
    this.name = name;
    this.pokemon = pokemon;
  }

  public Pokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(Pokemon pokemon) {
    this.pokemon = pokemon;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
