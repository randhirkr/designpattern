package com.foundation4u.structural.proxy;

public class ModernVehicle extends MultiFeatureVehicle{

	@Override
	public void prepare() {
		System.out.println("preparing mutifeature vehicle takes lot of time");
	}

	@Override
	public void ride() {
		System.out.println("riding modern vehicle");
	}

}
