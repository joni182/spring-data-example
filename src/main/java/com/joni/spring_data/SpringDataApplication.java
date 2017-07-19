package com.joni.spring_data;

import com.joni.spring_data.SpringConfiguration;
import com.joni.spring_data.entities.Animals;
import com.joni.spring_data.repositories.AnimalRepository;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		/*Animals p = new Animals(10, "pepa", "55555555555", new Date(2007, 04, 21), false);
		AnimalRepository pRepositorio = contexto.getBean(AnimalRepository.class);
		pRepositorio.save(p);

		List<Animals> animals = pRepositorio.findAll();

		Iterator<Animals> it = animals.iterator();

		while (it.hasNext()) {
			Animals animalDao = (Animals) it.next();
			System.out.println(animalDao.getName());
		}*/

	}
}