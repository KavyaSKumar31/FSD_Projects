package com.mycompany.spring_dependency_injection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BaseBallCoach implements Coach {


	
	private FortuneService fortune;


	
	public BaseBallCoach() {
		super();
	}


//	@Autowired
	public BaseBallCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}


	@Autowired
	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}


	//@Override
	public String getDailyWorkout() {

		return "practice back volley today";
	}

	
	@Override
	public String getDailyFortune() {

		return fortune.getFortune().toString();
	}

}
