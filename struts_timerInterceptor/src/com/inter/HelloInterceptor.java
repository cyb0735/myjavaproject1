package com.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class HelloInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String intercept(ActionInvocation arg0) throws Exception{
		System.out.println("Interceptor exzating......");
		String resuletString =arg0.invoke();
		System.out.println("Interceptor ended.....");
		return resuletString;
		
	}
}
