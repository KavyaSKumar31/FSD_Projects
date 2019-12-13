package com.example.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springdemo")
public class SportConfig {
	
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	@Bean
	public Coach tennisCoach() {
		TennisCoach tennisCoach = new TennisCoach(sadFortuneService());
		
		return tennisCoach;
	}
	
}








