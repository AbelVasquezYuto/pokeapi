package com.demo.spring.mvc.pokeapi.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.spring.mvc.pokeapi.models.Species;
import com.demo.spring.mvc.pokeapi.service.api.PokemonServiceAPI;
import com.demo.spring.mvc.pokeapi.service.api.SpecieServiceAPI;
import com.demo.spring.mvc.pokeapi.service.api.UrlChainServiceAPI;

@Controller
public class PokemonController {

	@Autowired 
	private SpecieServiceAPI specieServiceAPI;
	
	@Autowired 
	private PokemonServiceAPI pokemonServiceAPI;
	
	@Autowired 
	private UrlChainServiceAPI urlChainServiceAPI;
	
	 
	@RequestMapping(value = "/")
	public String findAll(@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString())) : 0;
		
		try {
			Species species = specieServiceAPI.getAllSpecies(page);
			model.addAttribute("list", species.getResults());
			model.addAttribute("next", species.getNext());
			model.addAttribute("previous", species.getPrevious());
			model.addAttribute("pagSiguiente", page+10);
			model.addAttribute("pagAnterior", page-10);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "index";
	}
	
	@GetMapping("/info/{name}")
	public String showPokemon(@PathVariable("name") String name, Model model) {
		if(name != null && name != "") {
			model.addAttribute("pokemon", pokemonServiceAPI.getPokemonByName(name));
		}else {
			return "redirect:/";
		}
		return "info";
	}
	
	@GetMapping(value="/chain")
	public String showChain(@RequestParam(value="url") String url, Model model) {
		
		List<String> nombres = urlChainServiceAPI.getUrlChain(url);
		
		if(nombres.size() == 1) {
			model.addAttribute("evol1", pokemonServiceAPI.getPokemonByName(nombres.get(0)));
			model.addAttribute("evol2", null);
			model.addAttribute("evol3", null);
		}else if(nombres.size() == 2){
			model.addAttribute("evol1", pokemonServiceAPI.getPokemonByName(nombres.get(0)));
			model.addAttribute("evol2", pokemonServiceAPI.getPokemonByName(nombres.get(1)));
			model.addAttribute("evol3", null);
		}else if(nombres.size() == 3){
			model.addAttribute("evol1", pokemonServiceAPI.getPokemonByName(nombres.get(0)));
			model.addAttribute("evol2", pokemonServiceAPI.getPokemonByName(nombres.get(1)));
			model.addAttribute("evol3", pokemonServiceAPI.getPokemonByName(nombres.get(2)));
		}
		
		return "chain";
	}

}
