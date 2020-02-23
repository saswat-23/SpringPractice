package com.practise.ioc;

public class Vodafone implements Sim {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Vodafone Sim");
	}

	@Override
	public void browseInternet() {
		// TODO Auto-generated method stub
		System.out.println("Browsing Internet from Vodafone Sim");
	}

}
