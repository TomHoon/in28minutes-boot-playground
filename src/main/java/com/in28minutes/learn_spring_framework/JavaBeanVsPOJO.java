package com.in28minutes.learn_spring_framework;

class Pojo {
	private String text;
	
	private int number;
	
	public String toString() {
		return text + ":" + number;
	}
}

class JavaBean {
	private String text;
	
	private int number;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "JavaBean [text=" + text + ", number=" + number + "]";
	}
	
	
	
}