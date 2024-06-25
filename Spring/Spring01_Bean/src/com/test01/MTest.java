package com.test01;

import org.springframework.context.ApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplication("com/test01/beans.xml");  // bean 객체생성
		MessageBeanEn en = (MessageBeanEn) factory.getBean("eng"); // bean 의 id 
		en.sayHello("Spring");
	}

}
