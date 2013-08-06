package com.springBeans;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");
		
		Performer perform = (Performer) ctx.getBean("duke");
		
		Poem sonet = new Sonet();
		Performer duke = new PoeticJuggler(15, sonet );
		
		Performer kenny = (Performer) ctx.getBean("pianoPlayer");
		
		List cities = (List) ctx.getBean("cities");
		
		System.out.println(cities);
		

		try {
			kenny.perform();
		} catch (PerformanceException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		/*
		try {
			duke.perform();
		} catch (PerformanceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			perform.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
