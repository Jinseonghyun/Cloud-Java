package com.test09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test09/applicationContext.xml");
		
		MyNickNamePrn myNick = factory.getBean("myNickNamePrn", MyNickNamePrn.class);
		System.out.println(myNick);

	}

}
