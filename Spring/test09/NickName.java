package com.test09;

import org.springframework.stereotype.Component;

@Component // 스프링이 bean을 생성하고 자기가 관리한다.
public class NickName {

	@Override
	public String toString() {
		return "Hello";
	}
	
	
}
