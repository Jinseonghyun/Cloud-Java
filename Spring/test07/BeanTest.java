package com.test07;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class BeanTest {

	public BeanTest() {
		System.out.println("기본 생성자!");
	}
	
	public BeanTest(Date date) {
		System.out.println("날짜 생성자(date: "+ date+")");
	}
	
	public void setnumber(int num) {
		System.out.println("setNumber 호출: " + num);
	}
	
	public void setArray(String[] arr) {
		System.out.println("setArray 호출");
		for(String val : arr) {
			System.out.println("이름: " + val);
		}
	}
	
	public void setList(List<String> list) {
		System.out.println("setList 호출");
		for (String val:list) {
			System.out.println(val);
		}
	}
	
	public void setMap(Map<String, String> map) {
		System.out.println("setMap 호출");
	}
	
	public void setMy(List<MyClass> list) {
		System.out.println("setMy 호출");
		for(MyClass mc : list) {
			System.out.println(mc);
		}
	}
	
}
