package com.dszpiczakowska.doodies;

import com.dszpiczakowska.doodies.domain.model.Activity;
import com.dszpiczakowska.doodies.domain.model.ActivityCategory;
import com.dszpiczakowska.doodies.domain.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoodiesApplication implements CommandLineRunner { //klasa implementuje interfejs

	@Autowired
	ActivityRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DoodiesApplication.class, args);
	}

	@Override
	public void run(String... args) {
		repository.save(new Activity("Siłownia", "Trening siłowy na koksowni", ActivityCategory.SPORT));
		repository.save(new Activity("Rower", "Jazda dookoła bloku 10km", ActivityCategory.SPORT));
		repository.save(new Activity("Sprzątanie", "Sprzątanie mieszkania", ActivityCategory.HOME));
		repository.save(new Activity("Praca", "Przygotowanie umowy najmu", ActivityCategory.WORK));
	}
}
