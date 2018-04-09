package com.greenfoxacademy.programmerfoxclub.temp;
import com.greenfoxacademy.programmerfoxclub.factory.PokemonFactory;
import com.greenfoxacademy.programmerfoxclub.factory.UserFactory;
import com.greenfoxacademy.programmerfoxclub.models.Pokemon;
import com.greenfoxacademy.programmerfoxclub.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Database {

  private UserFactory userFactory;
  private PokemonFactory pokemonFactory;
  public List<User> USERS;
  public List<Pokemon> POKEMON;

  public Database() {
    userFactory = new UserFactory();
    pokemonFactory = new PokemonFactory();
    POKEMON = new ArrayList<>(Arrays.asList(
              pokemonFactory.createPokemon("Bulbasaur","https://vignette.wikia.nocookie.net/legendsofthemultiuniverse/images/4/4c/001_bulbasaur_by_pklucario-d5z1g10.png/revision/latest?cb=20170701131534"),
              pokemonFactory.createPokemon("Squirtle","https://vignette.wikia.nocookie.net/winx-club-and-freinds-adventures/images/e/e3/Squirtle.png/revision/latest?cb=20170420051843"),
              pokemonFactory.createPokemon("Charmeleon", "http://static.pokemonpets.com/images/monsters-images-300-300/5-Charmeleon.png"),
              pokemonFactory.createPokemon("Pikachu","https://vignette.wikia.nocookie.net/camphalfbloodroleplay/images/7/77/Pikachu.png")
      ));
    USERS = new ArrayList<>(Arrays.asList(
            userFactory.createUser("Attila", POKEMON.get(1)),
            userFactory.createUser("Samu", POKEMON.get(0))
    ));
  }

}