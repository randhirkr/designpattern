package com.foundation4u.builder;

public class ShowroomBuilder {
	public Showroom getTwoWheeler(){
		Showroom showRoom = new Showroom();
		showRoom.addVehicles(new HeroHonda());
		showRoom.addVehicles(new Pulsar());
		return showRoom;
	}
	
	public Showroom getFourWheeler(){
		Showroom showRoom = new Showroom();
		showRoom.addVehicles(new Maruti());
		showRoom.addVehicles(new Santro());
		return showRoom;
	}
}
