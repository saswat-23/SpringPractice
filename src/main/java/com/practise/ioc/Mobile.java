package com.practise.ioc;

public class Mobile {

	Sim sim;
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		//Runtime Polymorphism
		mobile.sim = new Vodafone();
		
		mobile.testCallOnMobile();
	}
	
	
	public void testCallOnMobile() {
		sim.call();
	}
	
}
