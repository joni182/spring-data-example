package com.joni.spring_data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joni.spring_data.entities.Animals;
import com.joni.spring_data.entities.Animals;

@Repository
public interface AnimalRepository extends JpaRepository<Animals,Long> {


}
