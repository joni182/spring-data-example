package com.joni.spring_data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Animals createAnimals(@RequestBody Animals animal) {
		
		return animalRepository.save(animal);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/{animalsId}")
	public Animals updateAnimals(@PathVariable("animalsId") Long animalsId,@RequestBody Animals animal){
		
		if (animal != null && animalRepository.exists(animalsId)){
			
			Animals oldAnimal = animalRepository.findOne(animalsId);
			
			oldAnimal.setName(animal.getName());
			oldAnimal.setBirth(animal.getBirth());
			oldAnimal.setChip(animal.getChip());
			oldAnimal.setRace(animal.getRace());
			oldAnimal.setPpp(animal.isPpp());
			
			return animalRepository.save(oldAnimal);
		}
		
		
		return null;
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{animalsId}")
	public Animals readAnimals(@PathVariable("animalsId") Long animalsId){
		
		return animalRepository.findOne(animalsId);
		
	}
	

}
