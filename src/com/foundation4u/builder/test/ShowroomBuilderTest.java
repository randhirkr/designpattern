package com.foundation4u.builder.test;

import com.foundation4u.builder.Showroom;
import com.foundation4u.builder.ShowroomBuilder;

public class ShowroomBuilderTest {

	public static void main(String[] args) {
		ShowroomBuilder showroomBuilder = new ShowroomBuilder();
		
		Showroom twoWheelerShowRoom = showroomBuilder.getTwoWheeler();
		twoWheelerShowRoom.showVehicleDetails();
		
		System.out.println();
		
		Showroom fourWheelerShowRoom = showroomBuilder.getFourWheeler();
		fourWheelerShowRoom.showVehicleDetails();
		
	}

}
