package com.imooc.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyhttpSessionListener implements HttpSessionListener {
	
	private int userNumber;
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		ServletContext context = arg0.getSession().getServletContext();
		Integer count = (Integer) context.getAttribute("userNumber");
		if(count == null){
			count = 1;
		}else{
			count++;
		}
		context.setAttribute("userNumber", count);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		ServletContext context = arg0.getSession().getServletContext();
		Integer count = (Integer) context.getAttribute("userNumber");
		count--;
		context.setAttribute("userNumber", count);
		
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

}
