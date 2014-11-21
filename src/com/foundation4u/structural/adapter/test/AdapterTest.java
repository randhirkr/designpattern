package com.foundation4u.structural.adapter.test;

import com.foundation4u.structural.adapter.HeroHonda;
import com.foundation4u.structural.adapter.Splendor;
import com.foundation4u.structural.adapter.TwoWheeler;
import com.foundation4u.structural.adapter.Vehicle;

public class AdapterTest {

	public static void main(String[] args) {
		Vehicle vehicle = new TwoWheeler();
		vehicle.ride();
		
		HeroHonda heroHonda = new Splendor();
		heroHonda.ride();
		heroHonda.type();
	}

}
