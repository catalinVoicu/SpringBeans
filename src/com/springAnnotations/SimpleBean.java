package com.springAnnotations;

public class SimpleBean {
	
	private static final String DEFAULT_NAME = "Luke Skywalker";
	
	private String name = null;
	
	private int age = Integer.MIN_VALUE;
	
	public void setName( String theName ) {
		this.name = theName;
	}
	
	public void setAge ( int theAge ) {
		this.age = theAge;
	}
	
	public void init() {
		
		System.out.println("Initializing bean...!");
		
		if( name == null ) {
			System.out.println("Using default name");
			name = DEFAULT_NAME;
		}
		
		if( age == Integer.MIN_VALUE ) {
			throw new IllegalArgumentException(
					"You must set the age property of any beans type " + SimpleBean.class);
		}
	}
	
	public String toString() {
		return "Name: " + name + "\nAge " + age; 
	}
}
