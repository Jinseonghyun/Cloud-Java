package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/beans.xml");

		MessageBean banana = (MessageBean) factory.getBean("banana");
		banana.sayHello();
		
		MessageBean apple = (MessageBean) factory.getBean("apple");
		apple.sayHello();
	}

}
