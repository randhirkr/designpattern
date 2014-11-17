package com.foundation4u.abstractfactory.test;

import com.foundation4u.abstractfactory.AbstractFactory;
import com.foundation4u.abstractfactory.FactoryCreator;
import com.foundation4u.abstractfactory.Quality;
import com.foundation4u.abstractfactory.Vehicle;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		
		// get vehicle factory
		AbstractFactory vehicleFactory = FactoryCreator.getFactory("vehicle");
		// get vehicle instance from Factory
		Vehicle twowheeler = vehicleFactory.getVehicleInstance("twowheeler");
		twowheeler.ride();
		
		Vehicle fourwheeler = vehicleFactory.getVehicleInstance("fourwheeler");
		fourwheeler.ride();
		
		//get quality factory
		AbstractFactory qualityFactory = FactoryCreator.getFactory("quality");
		// get Quality instance
		Quality goodQuality = qualityFactory.getQualityInstance("goodquality");
		goodQuality.describe();
		
		Quality badQuality = qualityFactory.getQualityInstance("badquality");
		badQuality.describe();
	}
}
