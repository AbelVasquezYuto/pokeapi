package com.demo.spring.mvc.pokeapi.models;

import java.util.List;

public class Pokemon {

	private String height;
	private String weight;
	private Results species;
	private Sprites sprites;
	private String base_experience;
	private List<Abilities> abilities;
	
	public List<Abilities> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Abilities> abilities) {
		this.abilities = abilities;
	}

	public String getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(String base_experience) {
		this.base_experience = base_experience;
	}

	public Sprites getSprites() {
		return sprites;
	}

	public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}

	public Results getSpecies() {
		return species;
	}

	public void setSpecies(Results species) {
		this.species = species;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	
}
