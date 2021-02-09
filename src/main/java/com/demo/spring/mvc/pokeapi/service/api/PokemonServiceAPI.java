package com.demo.spring.mvc.pokeapi.service.api;

import com.demo.spring.mvc.pokeapi.models.Pokemon;

public interface PokemonServiceAPI {

	public Pokemon getPokemonByName(String name);

}
