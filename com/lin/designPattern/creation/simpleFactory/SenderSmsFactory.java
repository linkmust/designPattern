package com.lin.designPattern.creation.simpleFactory;

import com.lin.designPattern.creation.normalFactory.MsnSender;
import com.lin.designPattern.creation.normalFactory.Sender;

public class SenderSmsFactory implements Provider {

	public Sender produce() {
		return new MsnSender();
	}

}
