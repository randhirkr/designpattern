package com.foundation4u.factory;


public class CustomFactory {

	public static Vehicle getInstance(String objType){
		
		if(objType == null){
			return null;
		}
		if(objType.equalsIgnoreCase("twowheeler")){
			return new TwoWheeler();
		}
		if(objType.equalsIgnoreCase("fourwheeler")){
			return new FourWheeler();
		}
		return null;
	}
}
