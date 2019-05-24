package com.lin.designPattern.creation.prototype;

import java.io.Serializable;

public class DeepPrototype implements Cloneable,Serializable{

	private static final long serialVersionUID = 1L;
	private String str;
	private SerializableObject object;
	
	/**
	 * «≥∏¥÷∆
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	/**
	 * …Ó∏¥÷∆
	 */
	public Object deepClone(){
		
		
		return null;
	}
	
	
	
	
	
	
}
