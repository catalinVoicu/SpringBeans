package com.springBeans;

public class Juggler implements Performer {

	private int beanBags = 3;
	
	public Juggler() {
		
	}
	
	public Juggler( int beanBags ) {
		this.beanBags = beanBags;
	}

	
	@Override
	public void perform() throws PerformanceException{
		System.out.println("Juggling " + beanBags + "beanBags");
	}

}