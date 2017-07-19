package com.joni.spring_data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joni.spring_data.entities.Animals;
import com.joni.spring_data.entities.Animals;

@Repository
public interface AnimalRepository extends JpaRepository<Animals,String> {

	Animals findOne(String arg0);
	List<Animals> findAll();
	
	<S extends Animals> S save(S arg0);
	<S extends Animals> List<S> save(Iterable<S> arg0);
	
	long count();
}
