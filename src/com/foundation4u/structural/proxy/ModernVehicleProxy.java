package com.foundation4u.structural.proxy;

public class ModernVehicleProxy extends ModernVehicle{
	private ModernVehicle moderVehicle = null;
	
	public void prepare(){
		if(moderVehicle == null){
			moderVehicle = new ModernVehicle();
		}
	}
}
