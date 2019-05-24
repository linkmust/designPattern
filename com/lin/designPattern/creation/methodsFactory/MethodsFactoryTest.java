package com.lin.designPattern.creation.methodsFactory;

public class MethodsFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SenderFactory factory = new SenderFactory();
		factory.mailSender().send();
	}

}
