package com.spring.ioc.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach coach=context.getBean("baseballcoach",Coach.class);
		
		System.out.println(coach.getWorkout());
		
		context.close();
		
		
		
	}

}
