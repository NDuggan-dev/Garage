package com.qa.vehicle;

public class Runner {

	public static void main(String[] args) {
		Car bmw = new Car("BMW", 2012, "320d", 4, "Silver");
		Car audi = new Car("AUDI", 2012, "TT", 4, "Red");
		Motorbike harleyDavison = new Motorbike("Harley davison", 2012, "Firecracker", 2, "FIRE");
		Motorbike suzuki = new Motorbike("Suzuki", 2012, "Swift", 2, "Yellow");
		
		Garage clivesGarage = new Garage();
		clivesGarage.addVehicleToStock(bmw);
		clivesGarage.addVehicleToStock(audi);
		clivesGarage.addVehicleToStock(harleyDavison);
		clivesGarage.addVehicleToStock(suzuki);
		
		clivesGarage.vehicleBillList();
		clivesGarage.vehicleBill(suzuki);
		
		clivesGarage.removeVehicleTypes("Car");
	}

}
