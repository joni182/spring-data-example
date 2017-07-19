package com.joni.spring_data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Races {

	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private long id_race;
	private String race;
	
	@ManyToOne
	private Species species;

	public Races(long id_race, String race) {
		super();
		this.id_race = id_race;
		this.race = race;
	}

	public Races() {
		super();
	}

	public long getId_race() {
		return id_race;
	}

	public void setId_race(long id_race) {
		this.id_race = id_race;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}
	
	
	
	
}
