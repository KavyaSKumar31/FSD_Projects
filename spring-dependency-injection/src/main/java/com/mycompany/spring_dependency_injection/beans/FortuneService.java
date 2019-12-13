package com.mycompany.spring_dependency_injection.beans;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day";
	}

}
