package com.ocajexam.chapter.eleven.model;

public class Water {

	private String source;

	public Water(String source) {
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return this.source;
	}
}