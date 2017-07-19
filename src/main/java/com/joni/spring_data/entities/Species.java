package com.joni.spring_data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Species {

	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private long id_species;
	private String name;
}
