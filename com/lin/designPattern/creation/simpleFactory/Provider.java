package com.lin.designPattern.creation.simpleFactory;

import com.lin.designPattern.creation.normalFactory.Sender;

public interface Provider {
	public Sender produce();
}
