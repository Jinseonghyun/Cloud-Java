package com.test07;


public class MyClass {
	
	private String name;
	private int age;

	public MyClass() {
		System.out.println("MyClass constructor call");
	}
	
	public void prn() {
		System.out.println("prn() method call!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyClass [name=" + name + ", age=" + age + "]";
	}
	
	

}
