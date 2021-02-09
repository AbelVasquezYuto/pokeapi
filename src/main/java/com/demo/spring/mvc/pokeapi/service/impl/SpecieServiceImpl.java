package com.demo.spring.mvc.pokeapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.mvc.pokeapi.models.Species;
import com.demo.spring.mvc.pokeapi.service.api.SpecieServiceAPI;

@Service
public class SpecieServiceImpl implements SpecieServiceAPI{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Species getAllSpecies(int page) {
		// TODO Auto-generated method stub
		
		Species species = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon-species/?offset="+page+"&limit=10",
				Species.class);
		
		return species;
	}

}
