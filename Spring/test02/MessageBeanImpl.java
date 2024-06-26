package com.test02;

public class MessageBeanImpl implements MessageBean {

	private String fruit; // 필드 2개 선언
	private int cost;
	
	
	@Override
	public void sayHello() {
		System.out.println("과일: " + fruit + "\t 가격: " + cost);
	}
	
	// 기본 생성자
	public MessageBeanImpl() {
		this.fruit = "banana";
		this.cost = 5000;
	}
	
	public MessageBeanImpl(String fruit, int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}

	
	
}
