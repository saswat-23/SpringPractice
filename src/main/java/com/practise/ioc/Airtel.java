package com.practise.ioc;

public class Airtel implements Sim {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Airtel Sim");
	}

	@Override
	public void browseInternet() {
		// TODO Auto-generated method stub
		System.out.println("Browsing from Airtel Sim");
	}

}
