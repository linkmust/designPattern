package com.lin.designPattern.creation.normalFactory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory factory = new SendFactory();
		Sender send = factory.produce("mail");
		send.send();
		send = factory.produce("msn");
		send.send();
	}
}
