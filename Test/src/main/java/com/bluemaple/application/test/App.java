package com.bluemaple.application.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		System.out.println("bhjgjhgjhgj");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		System.out.println("hhhhh");
		Add qq=(Add) context.getBean("id2");
		Add qq1=(Add) context.getBean("id1");
		Add qq2=(Add) context.getBean("id3");
		
		System.out.println(qq);
		System.out.println(qq1);
		System.out.println(qq2);
		
		
	}

}
