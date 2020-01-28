package com.ocajexam.chapter.eleven.interface_funcional_predicate.model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;

public class PlanetApp {

	public static void main(String[] args) {

		Planet mercury = new Planet("Mercury", Color.GRAY, 0, false);
		Planet venus = new Planet("Venus", Color.YELLOW, 0, false);
		Planet earth = new Planet("Earth", Color.BLUE, 1, false);
		Planet mars = new Planet("Mars", Color.RED, 2, false);
		Planet jupiter = new Planet("Jupiter", Color.YELLOW, 67, true);
		Planet saturn = new Planet("Saturn", Color.ORANGE, 62, true);
		Planet uranus = new Planet("Uranus", Color.TEAL, 27, true);
		Planet neptune = new Planet("Neptune", Color.BLUE, 14, true);
		
		List<Planet> planetsList = new ArrayList<>();
		planetsList.add(mercury);
		planetsList.add(venus);
		planetsList.add(earth);
		planetsList.add(mars);
		planetsList.add(jupiter);
		planetsList.add(saturn);
		planetsList.add(uranus);
		planetsList.add(neptune);
		
		System.out.println("Has one or more rings: " + PlanetPredicates.listFilteredPlanets(planetsList, p -> p.isRinged()));
		
		System.out.print("Has Moon and is blue: ");
		planetsList.stream().filter(p -> p.getNumbersOfMoons() > 0 & (p.getPrimaryColor() == Color.BLUE)).forEach(s -> System.out.print(s + " "));
		
		System.out.print("\nHas over twenty moons: ");
		planetsList.stream().filter(p -> (p.getNumbersOfMoons() > 20)).forEach(p -> System.out.print(p + " "));
		
		System.out.print("\nHas a color not black: ");
		planetsList.stream().filter(p -> (p.getPrimaryColor() != Color.BLACK)).forEach(p -> System.out.print(p + " "));
		
		planetsList.removeIf((p -> p.getNumbersOfMoons() == 0));
		System.out.println("\nHas one or more moons: " + planetsList);
		
		System.out.print("Has a color: ");
		planetsList.stream().filter(p -> p.hasColor(p)).forEach(p -> System.out.print(p + " "));
	}

}
