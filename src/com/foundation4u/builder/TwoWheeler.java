package com.foundation4u.builder;

public abstract class TwoWheeler implements Vehicle{

	@Override
	public Engine type() {
		return new TwoStroke();
	}


}
