package com.foundation4u.abstractfactory;

import com.foundation4u.abstractfactory.FourWheeler;
import com.foundation4u.abstractfactory.TwoWheeler;

public class VehicleFactory extends AbstractFactory{

	@Override
	public Vehicle getVehicleInstance(String type) {
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("twowheeler")){
			return new TwoWheeler();
		}
		if(type.equalsIgnoreCase("fourwheeler")){
			return new FourWheeler();
		}
		return null;
	}

	@Override
	public Quality getQualityInstance(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
