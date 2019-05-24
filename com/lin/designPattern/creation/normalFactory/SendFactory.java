package com.lin.designPattern.creation.normalFactory;

public class SendFactory {

	public Sender produce(String type){
		if("mail" == type){
			return new MailSender();
		}else if("msn" == type){
			return new MsnSender();
		}else{
			System.out.println("no type match!");
			return null;
		}
	}
}
