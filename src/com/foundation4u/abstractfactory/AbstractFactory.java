package com.foundation4u.abstractfactory;

public abstract class AbstractFactory {
	public abstract Vehicle getVehicleInstance(String type);
	public abstract Quality getQualityInstance(String type);
}
