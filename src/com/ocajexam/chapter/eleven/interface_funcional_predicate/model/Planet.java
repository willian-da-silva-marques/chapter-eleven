package com.ocajexam.chapter.eleven.interface_funcional_predicate.model;

import com.ocajexam.chapter.eleven.interface_funcional_customized.NegativeColor;

import javafx.scene.paint.Color;

public class Planet implements NegativeColor<Planet>{

	private String name = "Unknown";
	private Color primaryColor = Color.WHITE;
	private Integer numbersOfMoons = 0;
	private Boolean ringed = false;

	public Planet(String name, Color primaryColor, Integer numbersOfMoons, Boolean ringed) {
		this.name = name;
		this.primaryColor = primaryColor;
		this.numbersOfMoons = numbersOfMoons;
		this.ringed = ringed;
	}

	public String getName() {
		return name;
	}

	public Color getPrimaryColor() {
		return primaryColor;
	}

	public Integer getNumbersOfMoons() {
		return numbersOfMoons;
	}
	
	public boolean isRinged() {
		return ringed;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean hasColor(Planet planet) {
		return planet.getPrimaryColor() == Color.RED;
	}
}
