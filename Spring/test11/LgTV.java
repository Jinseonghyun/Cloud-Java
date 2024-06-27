package com.test11;

import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV {

	@Override
	public void powerOn() {
	// TODO Auto-generated method stub
	System.out.println("lg tv power on");
	}
	
	@Override
	public void powerOff() {
	// TODO Auto-generated method stub
	System.out.println("lg tv power off");
	}

}