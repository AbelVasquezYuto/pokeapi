package com.demo.spring.mvc.pokeapi.models;

import java.util.List;

import lombok.Data;

@Data
public class EnvolvesTo {

	private Results species;
	private List<EnvolvesTo> evolves_to;
	
}
