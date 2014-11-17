package com.foundation4u.factory.test;

import com.foundation4u.factory.CustomFactory;
import com.foundation4u.factory.Vehicle;

public class FactoryTest {

	public static void main(String[] args) {
		Vehicle twoWheeler = CustomFactory.getInstance("twowheeler");
		twoWheeler.ride();
		
		Vehicle fourWheeler = CustomFactory.getInstance("fourwheeler");
		fourWheeler.ride();
		
	}

}
