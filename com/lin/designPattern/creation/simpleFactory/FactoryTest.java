package com.lin.designPattern.creation.simpleFactory;

import com.lin.designPattern.creation.normalFactory.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider = new SenderMailFactory();
		Sender send = provider.produce();
		send.send();
	}

}
