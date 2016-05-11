package com.ann.test;
@Description("I an interface")
public interface Person {
	@Description("I an interface method")
	public String name();
	public int age();
	
	@Deprecated
	public void sing();
}
