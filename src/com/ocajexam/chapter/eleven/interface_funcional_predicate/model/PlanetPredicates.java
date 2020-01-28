package com.ocajexam.chapter.eleven.interface_funcional_predicate.model;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javafx.scene.paint.Color;

public class PlanetPredicates {

	public static Predicate<Planet> hasMoonMoreThan(Integer moons) {
		return p -> p.getNumbersOfMoons() > moons;
	}

	public static Predicate<Planet> hasAColor() {
		return p -> p.getPrimaryColor() != Color.BLACK;
	}

	public static List<Planet> filterPlanets(List<Planet> planets, Predicate<Planet> predicate) {
		return planets.stream().filter(predicate).collect(Collectors.toList());
	}

	public static StringBuilder listFilteredPlanets(List<Planet> planets, Predicate<Planet> predicate) {
		StringBuilder sb = new StringBuilder();
		planets.stream().filter((planet) -> (predicate.test(planet))).forEach((planet) -> {
			sb.append(planet).append(" ");
		});
		return sb;
	}
}
