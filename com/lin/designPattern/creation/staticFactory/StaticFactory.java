package com.lin.designPattern.creation.staticFactory;

import com.lin.designPattern.creation.normalFactory.MailSender;
import com.lin.designPattern.creation.normalFactory.MsnSender;
import com.lin.designPattern.creation.normalFactory.Sender;

public class StaticFactory {

	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceMsn(){
		return new MsnSender();
	}
}
