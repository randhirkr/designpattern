package com.foundation4u.prototype.test;

import com.foundation4u.prototype.Vehicle;
import com.foundation4u.prototype.VehicleCache;

public class VehicleCacheTest {

	public static void main(String[] args) {
		VehicleCache.loadCache();
		
		Vehicle twoWheeler = VehicleCache.getVehicle("herohonda");
		System.out.println("twowheeler hashcode: "+twoWheeler.hashCode());
		System.out.println("twowheeler: "+twoWheeler.getType());
		
		Vehicle fourWheeler = VehicleCache.getVehicle("maruti");
		System.out.println("fourwheeler hashcode: "+fourWheeler.hashCode());
		System.out.println("fourwheeler: "+fourWheeler.getType());
	}

}
