package com.demo.spring.mvc.pokeapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.mvc.pokeapi.models.EvolutionChain;
import com.demo.spring.mvc.pokeapi.models.SpeciesChain;
import com.demo.spring.mvc.pokeapi.service.api.UrlChainServiceAPI;

@Service
public class UrlChainServiceImpl implements UrlChainServiceAPI{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<String> getUrlChain(String url) {
		// TODO Auto-generated method stub
		
		List<String> lista = new ArrayList<>();
		
		SpeciesChain speciesChain = restTemplate.getForObject(url, SpeciesChain.class);
		
		EvolutionChain evolutionChain = restTemplate.getForObject(speciesChain.getEvolution_chain().getUrl(), EvolutionChain.class);
		
		lista.add(evolutionChain.getChain().getSpecies().getName());
		
		if(!(evolutionChain.getChain().getEvolves_to().isEmpty())) {
			lista.add(evolutionChain.getChain().getEvolves_to().get(0).getSpecies().getName());
		}
		
		if(!(evolutionChain.getChain().getEvolves_to().get(0).getEvolves_to().isEmpty())) {
			lista.add(evolutionChain.getChain().getEvolves_to().get(0).getEvolves_to().get(0).getSpecies().getName());
		}
		
		return lista;
	}
	
}
