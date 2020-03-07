package com.factory.factorymethod;

public class Bmw320Factory implements Factory {

	@Override
	public BMW createBmw() {
		return new BMW320();
	}

}
