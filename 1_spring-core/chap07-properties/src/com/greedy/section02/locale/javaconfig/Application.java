package com.greedy.section02.locale.javaconfig;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section02.locale.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context
			= new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		String error404Message = context.getMessage("error.404", null, Locale.KOREA);
		String error500Message 
			= context.getMessage("error.500", new Object[] {"석이현!!", new Date()}, Locale.KOREA);

		System.out.println("error.404 : " + error404Message);
		System.out.println("error.500 : " + error500Message);
	}

}
