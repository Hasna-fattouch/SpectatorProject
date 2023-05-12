package com.example.ConsoleProject;

import com.example.ConsoleProject.Tour.Tour;
import com.example.ConsoleProject.Tour.TypeTour;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConsoleProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsoleProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Spectateur spectateur = new Spectateur();
		Dresseur dresseur1 = new Dresseur();
		Dresseur dresseur2 = new Dresseur();
		Singe singe1 = dresseur1.getSinge();
		Singe singe2 = dresseur2.getSinge();

		for (Tour tour : singe1.getTours()) {
			System.out.println("Le singe 1 exécute le tour : " + tour.getIndex());
			if (tour.getType() == TypeTour.ACROBATIE) {
				spectateur.applaudit(tour.getNom() );
			} else {
				spectateur.siffle(tour.getNom());
			}
		}

		for (Tour tour : singe2.getTours()) {
			System.out.println("Le singe 2 exécute le tour : " + tour.getIndex());
			if (tour.getType() == TypeTour.ACROBATIE) {
				spectateur.applaudit(tour.getNom());
			} else {
				spectateur.siffle(tour.getNom());
			}
		}
	}
}
