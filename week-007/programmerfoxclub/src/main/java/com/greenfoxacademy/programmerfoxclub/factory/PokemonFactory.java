package com.greenfoxacademy.programmerfoxclub.factory;
import com.greenfoxacademy.programmerfoxclub.models.Pokemon;

public class PokemonFactory {

  public Pokemon createPokemon(String name, String image) {
    Pokemon pokemon = new Pokemon(name, image);
    return pokemon;
  }
}
