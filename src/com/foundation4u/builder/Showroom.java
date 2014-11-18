package com.foundation4u.builder;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
	private List<Vehicle> vehicleList = new ArrayList<>();
	
	public void addVehicles(Vehicle vehicle){
		vehicleList.add(vehicle);
	}
	
	public void showVehicleDetails(){
		for(Vehicle vehicle : vehicleList){
			System.out.println("vehicle name: "+vehicle.name());
			System.out.println("vehicle price: "+vehicle.price());
			System.out.println("vehicle engine: "+vehicle.type().engineType());
		}
	}
}
