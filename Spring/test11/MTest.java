package com.test11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

public static void main(String[] args) {

	ApplicationContext factory =
	new ClassPathXmlApplicationContext("com/test11/applicationContext.xml");
	
	TV tv = factory.getBean("lg", TV.class);
	tv.powerOn();
	tv.powerOff();
	}
}