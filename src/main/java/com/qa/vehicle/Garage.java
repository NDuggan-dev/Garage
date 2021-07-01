package com.qa.vehicle;

import java.util.*;

public class Garage {
	private List<Vehicle> vehicleStock;
	
	public void vehicleBillList(){
		int bill;
		for(Vehicle vehicle : vehicleStock) {
			String receipt = vehicle.getVehicle() + "\nPrice: £"; 
			if (vehicle instanceof Car) {
				bill = 20;
				System.out.println(receipt + bill);
			}else if(vehicle instanceof Motorbike) {
				bill = 30;
				System.out.println(receipt + bill);
			}
		}
	}
	public void vehicleBill(Vehicle vehicle){
		int bill;
		String receipt = vehicle.getVehicle() + "\nPrice: £"; 
		if (vehicle instanceof Car) {
			bill = 20;
			System.out.println(receipt + bill);
		}else if(vehicle instanceof Motorbike) {
			bill = 30;
			System.out.println(receipt + bill);
		}
	}
	
	public void removeVehicle(int id) {
		vehicleStock.remove(id);
	}
	
	public void removeVehicle(Vehicle vehicle) {
		vehicleStock.remove(vehicle);
	}
	
	public void fixVehicle(Vehicle vehicle) {
		vehicleBill(vehicle);
		vehicleStock.remove(vehicle);
	}
	
	public void removeVehicleTypes(String type) {
		int removed = 0;
		for(int i = 0; i < vehicleStock.size(); i++) {
			if(type.equalsIgnoreCase("Car") && vehicleStock.get(i) instanceof Car) {
				vehicleStock.remove(i);
				removed++;
				i--;
			} else if(type.equalsIgnoreCase("Motorbike") && vehicleStock.get(i) instanceof Motorbike) {
				vehicleStock.remove(i);
				removed++;
				i--;
			}
		}
		if(removed > 0) {
			System.out.println("Removed vehicles: " + removed);
		} else {
			System.out.println("No vehicles removed please check input.");
		}
	}
	
	public Garage() {
		this.vehicleStock = new ArrayList<Vehicle>();
	}

	public List<Vehicle> getVehicleStock() {
		return vehicleStock;
	}

	public void setVehicleStock(List<Vehicle> vehicleStock) {
		this.vehicleStock = vehicleStock;
	}

	public void addVehicleToStock(Vehicle vehicle) {
		vehicleStock.add(vehicle);
	}
	
}
