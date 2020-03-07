package com.factory.factorymethod;

public class Test {

	public static void main(String[] args) {
		Factory factory1 = new Bmw320Factory();
		BMW bmw320 = factory1.createBmw();
		Factory factory2 = new Bmw531Factory();
		BMW bmw531 = factory2.createBmw();
	}
}
