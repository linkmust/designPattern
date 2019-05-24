package com.lin.designPattern.creation.staticFactory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticFactory factory = new StaticFactory();
		factory.produceMail().send();
		factory.produceMsn().send();
	}

}
