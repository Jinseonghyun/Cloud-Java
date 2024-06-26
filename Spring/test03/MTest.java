package com.test03;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test02.MessageBean;


public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");

		Address lee = (Address) factory.getBean("lee");
		System.out.println(lee);

	}

}
