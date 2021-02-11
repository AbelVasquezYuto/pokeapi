package com.demo.spring.mvc.pokeapi.models;

import lombok.Data;

@Data
public class Abilities {

	private Ability ability;
	private boolean is_hidden;
	private String slot;
			
}
