package com.ann.test;
//@Description("I am class annotation")
public class Child implements Person {

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	//@Description("I am method annotation")
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

}
