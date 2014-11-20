package com.foundation4u.prototype;

import java.util.Hashtable;
import java.util.Map;

public class VehicleCache {
	private static Map<String,Vehicle> vehicleMap = new Hashtable<>();
	
	public static Vehicle getVehicle(String vehicleName){
		Vehicle vehicle = vehicleMap.get(vehicleName);
		
		return (Vehicle) vehicle.clone();
	}
	/*
	 * this cache can be loaded from any resource
	 */
	public static void loadCache(){
			TwoWheeler twoWheeler = new TwoWheeler();
			twoWheeler.setVehicleName("herohonda");
			vehicleMap.put(twoWheeler.getVehicleName(), twoWheeler);
			System.out.println("original twowheeler hashcode: "+twoWheeler.hashCode());
			
			FourWheeler fourWheeler = new FourWheeler();
			fourWheeler.setVehicleName("maruti");
			vehicleMap.put("maruti", fourWheeler);
			System.out.println("original fourwheeler hashcode: "+fourWheeler.hashCode());
	}
}
