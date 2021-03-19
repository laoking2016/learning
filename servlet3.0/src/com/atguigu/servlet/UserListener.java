package com.atguigu.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class UserListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.print("UserListener...contextDestroyed...");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.print("UserListener...contextInitialized...");
	}
}
