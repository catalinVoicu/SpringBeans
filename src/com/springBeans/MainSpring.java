package com.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");
		
		Performer perform = (Performer) ctx.getBean("duke");
		
		Poem sonet = new Sonet();
		Performer duke = new PoeticJuggler(15, sonet );
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
		}
	}

}
