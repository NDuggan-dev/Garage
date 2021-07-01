package com.qa.vehicle;

public class Vehicle {
	private String manufacturer;
	private int year;
	private String model;
	
	
	public Vehicle() {
		
	}
	public Vehicle(String manufacturer, int year, String model) {
		super();
		this.manufacturer = manufacturer;
		this.year = year;
		this.model = model;
	}
	
	public String getVehicle() {
		return "Manufacturer: " + getManufacturer() + "\nModel(year): " + getModel() + "(" + getYear() + ")" ;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
