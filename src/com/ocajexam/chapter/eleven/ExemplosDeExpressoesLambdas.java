package com.ocajexam.chapter.eleven;

import java.util.Arrays;
import java.util.List;

public class ExemplosDeExpressoesLambdas {

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Ana","Bruna","Coroline");
		
		nomes.stream().mapToInt(n -> n.length()).forEach(i -> System.out.println(i));
	}

}
