package com.spring.ioc.annotations;

import org.springframework.stereotype.Component;

@Component
public class Baseballcoach implements Coach {

	@Override
	public String getWorkout() {
		
		return "practice batting daily";
	}

}
