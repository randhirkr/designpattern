package com.foundation4u.prototype;

public class TwoWheeler extends Vehicle{

	public TwoWheeler(){
		type = "two stroke vehicle";
	}
	
	@Override
	void ride() {
		System.out.println("riding two wheeler");
	}

}
