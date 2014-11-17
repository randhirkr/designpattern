package com.foundation4u.abstractfactory;

public class QualityFactory extends AbstractFactory{

	@Override
	public Vehicle getVehicleInstance(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quality getQualityInstance(String type) {
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("badquality")){
			return new BadQuality();
		}
		if(type.equalsIgnoreCase("goodquality")){
			return new GoodQuality();
		}
		return null;
	}

}
