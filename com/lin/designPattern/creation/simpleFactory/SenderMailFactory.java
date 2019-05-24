package com.lin.designPattern.creation.simpleFactory;

import com.lin.designPattern.creation.normalFactory.MailSender;
import com.lin.designPattern.creation.normalFactory.Sender;

public class SenderMailFactory implements Provider{

	@Override
	public Sender produce() {
		
		return new MailSender();
	}

}
