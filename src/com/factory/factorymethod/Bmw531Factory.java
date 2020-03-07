package com.factory.factorymethod;

public class Bmw531Factory implements Factory {

	@Override
	public BMW createBmw() {
		return new BMW531();
	}

}
