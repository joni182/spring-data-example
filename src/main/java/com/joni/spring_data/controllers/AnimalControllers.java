package com.joni.spring_data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joni.spring_data.entities.Animals;
import com.joni.spring_data.repositories.AnimalRepository;

@RestController
@RequestMapping("/animals")
public class AnimalControllers {
	
	@Autowired
	private AnimalRepository animalRepository;
	
	@RequestMapping("")
	public List<Animals> listAnimals() {
		
		return animalRepository.findAll();
		
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Animals createAnimals(@RequestBody  Animals animal) {
		
		return animalRepository.save(animal);
		
	}
	

}
