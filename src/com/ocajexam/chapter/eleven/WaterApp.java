package com.ocajexam.chapter.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ocajexam.chapter.eleven.model.Water;

public class WaterApp {

	public static void main(String[] args) {

		Water hardWater = new Water("Hard");
		Water softWater = new Water("Soft");
		Water boiledWater = new Water("Boiled");
		Water rawWater = new Water("Raw");
		Water rainWater = new Water("Rain");
		Water snowWater = new Water("Snow");
		Water filteredWater = new Water("Filtered");
		Water reverseOsmosisWater = new Water("Reverse Osmosis");
		Water deionizedWater = new Water("Deionized");
		Water distilledWater = new Water("Distilled");

		List<Water> waterList = new ArrayList<>();
		waterList.add(hardWater);
		waterList.add(softWater);
		waterList.add(boiledWater);
		waterList.add(rawWater);
		waterList.add(rainWater);
		waterList.add(snowWater);
		waterList.add(filteredWater);
		waterList.add(reverseOsmosisWater);
		waterList.add(deionizedWater);
		waterList.add(distilledWater);
		
		// antes de ordenar
		System.out.println("Not sorted: " + waterList);
		
		// depois de ordenar usando a interface Comparator a partir de uma classe
		Collections.sort(waterList, new WaterSort());
		System.out.println("1º Sorted: " + waterList);
		
		// depois de ordenar usando a interface Comparator com uma classe interna anônima 
		Collections.sort(waterList, new Comparator<Water>() {
			@Override
			public int compare(Water w1, Water w2) {
				return w1.getSource().compareTo(w2.getSource());
			}
		});
		System.out.println("2º Sorted: " + waterList);
		
		// depois de ordenar usando a interface Comparator com uma expressão lambda
		Collections.sort(waterList, (w1, w2) -> w1.getSource().compareTo(w2.getSource()));
		System.out.println("3º Sorted: " + waterList);
		
		waterList.stream().forEach(p -> {;;});
		
		String[] birdsArray = {"bluebird","scarlet macaw","bluejay"};
		List<String> birdList = Arrays.asList(birdsArray);
		birdList.stream().forEach((String p) -> System.out.print(p.toString().contains("blue") + " "));
	}
}
