package com.lin.designPattern.struction.objectAdapt;

import com.lin.designPattern.struction.adapt.Source;
import com.lin.designPattern.struction.adapt.Targetable;


public class AdaptTest {
	public static void main(String[] args) {
		Targetable target = new Wrapper(new Source());
		target.method_1();
		target.method_2();
	}
}
