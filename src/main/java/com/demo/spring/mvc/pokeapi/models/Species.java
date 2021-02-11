package com.demo.spring.mvc.pokeapi.models;

import java.util.List;

import lombok.Data;

@Data
public class Species {

	private Integer count;
	private String next;
	private String previous;
	private List<Results> results;
	
}
