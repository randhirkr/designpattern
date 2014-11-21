package com.foundation4u.structural.proxy.test;

import com.foundation4u.structural.proxy.ModernVehicle;
import com.foundation4u.structural.proxy.ModernVehicleProxy;

public class ModernVehicleProxyTest {
	public static void main(String[] args) {
		ModernVehicle modernVehicle = 	new ModernVehicleProxy();
		
		System.out.println("-----------real vehicle----------");
		modernVehicle.ride();
		System.out.println("---------now proxy vehicle-------");
		modernVehicle.ride();
	}
}
