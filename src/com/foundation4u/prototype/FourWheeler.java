package com.foundation4u.prototype;

public class FourWheeler extends Vehicle{

	public FourWheeler(){
		type = "four stroke engine";
	}
	@Override
	void ride() {
		System.out.println("riding four wheeler");
	}

}
