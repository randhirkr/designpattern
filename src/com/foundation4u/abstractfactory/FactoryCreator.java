package com.foundation4u.abstractfactory;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String type){
		if(type.equalsIgnoreCase("vehicle")){
			return new VehicleFactory();
		}
		if(type.equalsIgnoreCase("quality")){
			return new QualityFactory();
		}
		return null;
	}
}
