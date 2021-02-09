package com.demo.spring.mvc.pokeapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.mvc.pokeapi.models.Pokemon;
import com.demo.spring.mvc.pokeapi.service.api.PokemonServiceAPI;

@Service
public class PokemonServiceImpl implements PokemonServiceAPI{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Pokemon getPokemonByName(String name) {
		// TODO Auto-generated method stub
		
		Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/"+name,
				Pokemon.class);
		
		return pokemon;
	}

}
