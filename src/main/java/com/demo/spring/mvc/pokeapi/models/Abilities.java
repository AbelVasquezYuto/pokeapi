package com.demo.spring.mvc.pokeapi.models;

public class Abilities {

	private Ability ability;
	private boolean is_hidden;
	private String slot;
	
	public Ability getAbility() {
		return ability;
	}
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	public boolean isIs_hidden() {
		return is_hidden;
	}
	public void setIs_hidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
		
}
