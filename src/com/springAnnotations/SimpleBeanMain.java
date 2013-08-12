package com.springAnnotations;

//import javax.naming.Context;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.context.ApplicationContext;

public class SimpleBeanMain {
	
	public static void main( String args [] ){ 
	
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:springAnnotations/simpleBean.xml");
		ctx.refresh();
		
		SimpleBean sb1 = getBean("simpleBean1", ctx);
		SimpleBean sb2 = getBean("simpleBean2", ctx);
		SimpleBean sb3 = getBean("simpleBean3", ctx);
		
	}
	
	private static SimpleBean getBean( String beanName, ApplicationContext ctx ) {
		try {
			SimpleBean bean = (SimpleBean) ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex ){
			System.out.println("An error occured in bean configuration: "
					+ ex.getMessage());
			return null;
		}
	}

}
