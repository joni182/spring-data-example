package com.joni.spring_data.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animals {

	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private long id_animals;
	private String name;
	private String chip;
	private Date birth;
	private boolean ppp;
	
	@ManyToOne
	private Races race;

	public Animals(long id_animals, String name, String chip, Date birth, boolean ppp) {
		super();
		this.id_animals = id_animals;
		this.name = name;
		this.chip = chip;
		this.birth = birth;
		this.ppp = ppp;
	}

	public Animals() {
		super();
	}

	public long getId_animals() {
		return id_animals;
	}

	public void setId_animals(long id_animals) {
		this.id_animals = id_animals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public boolean isPpp() {
		return ppp;
	}

	public void setPpp(boolean ppp) {
		this.ppp = ppp;
	}

	public Races getRace() {
		return race;
	}

	public void setRace(Races race) {
		this.race = race;
	}
	
	
	
	
}
