package com.greenfoxacademy.programmerfoxclub.repositories;
import com.greenfoxacademy.programmerfoxclub.models.Pokemon;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface PokemonRepository {

  List<Pokemon> findAll();

}