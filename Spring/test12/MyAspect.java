package com.test12;

public class MyAspect {

	public void before() {
		System.out.println("출석을 한다.");
	}
	
	public void after() {
		System.out.println("집에 간다.");
	}
}
