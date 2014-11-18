package com.foundation4u.builder;

public abstract class FourWheeler implements Vehicle{

	@Override
	public Engine type() {
		return new FourStroke();
	}

}
