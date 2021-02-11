package com.demo.spring.mvc.pokeapi.models;

import java.util.List;

import lombok.Data;

@Data
public class ChainMain {

	private Results species;
	private List<EnvolvesTo> evolves_to;
		
}
