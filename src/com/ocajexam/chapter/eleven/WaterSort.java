package com.ocajexam.chapter.eleven;

import java.util.Comparator;

import com.ocajexam.chapter.eleven.model.Water;

public class WaterSort implements Comparator<Water> {

	@Override
	public int compare(Water w1, Water w2) {
		return w1.getSource().compareTo(w2.getSource());
	}
}