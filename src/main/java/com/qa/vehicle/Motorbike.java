package com.qa.vehicle;

public class Motorbike extends Vehicle{
	private int wheels;
	private String color;
	
	public Motorbike() {
		
	}
	public Motorbike(String manufacturer, int year, String model, int wheels, String color) {
		super(manufacturer, year, model);
		this.wheels = wheels;
		this.color = color;
	}
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
