package comm.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "comm.example")

public class SportConfig {
	@Bean

	public Coach tennisCoach()
	{
		return new TennisCoach(randomFortuneService());
	}
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}

}
