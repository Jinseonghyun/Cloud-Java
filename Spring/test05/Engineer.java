package com.test05;

public class Engineer extends Emp {
	private String dept;
	
	public Engineer() {}

	// 부모의 필드가 생성 될 때 값들이 초기화 될 수 있게
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "\t dept: " + dept;
	}


	
	
	
	
}
