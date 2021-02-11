package com.demo.spring.mvc.pokeapi.models;

import java.util.List;

import lombok.Data;

@Data
public class Pokemon {

	private String height;
	private String weight;
	private Results species;
	private Sprites sprites;
	private String base_experience;
	private List<Abilities> abilities;
	
}
