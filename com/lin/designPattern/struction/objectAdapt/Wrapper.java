package com.lin.designPattern.struction.objectAdapt;

import com.lin.designPattern.struction.adapt.Source;
import com.lin.designPattern.struction.adapt.Targetable;

public class Wrapper implements Targetable {
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method_1() {
		// TODO Auto-generated method stub
		source.method_1();
	}

	@Override
	public void method_2() {
		// TODO Auto-generated method stub
		System.out.println("method_2");
	}

}
