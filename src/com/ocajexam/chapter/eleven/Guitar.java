package com.ocajexam.chapter.eleven;

public class Guitar {

	public static void main(String[] args) {

		Strummable strummable = () -> {	System.out.println("strummed!");};
		strummable.strum();
	}

	@FunctionalInterface
	interface Strummable {

		void strum();
	}
}
