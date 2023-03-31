package com.spring.ioc.annotations.practice4;

import org.springframework.stereotype.Component;

@Component("fbc")
public class FootballCoach implements Coach {

	@Override
	public String getWorkout() {
		
		return "pratice goal";
	}

}
