package com.demo.spring.mvc.pokeapi.models;

import java.util.List;

public class EnvolvesTo {

	private Results species;
	private List<EnvolvesTo> evolves_to;
	
	public Results getSpecies() {
		return species;
	}
	public void setSpecies(Results species) {
		this.species = species;
	}
	
	public List<EnvolvesTo> getEvolves_to() {
		return evolves_to;
	}
	public void setEvolves_to(List<EnvolvesTo> evolves_to) {
		this.evolves_to = evolves_to;
	}
	
}
