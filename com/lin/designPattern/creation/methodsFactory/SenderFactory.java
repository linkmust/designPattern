package com.lin.designPattern.creation.methodsFactory;

import com.lin.designPattern.creation.normalFactory.MailSender;
import com.lin.designPattern.creation.normalFactory.MsnSender;
import com.lin.designPattern.creation.normalFactory.Sender;

public class SenderFactory {
	
	public Sender msnSender(){
		return new MsnSender();
	}
	
	public Sender mailSender(){
		return new MailSender();
	}
	
}
