package com.mycompany.spring_aop_before_advice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.mycompany.spring_aop_before_advice")
public class DemoConfig {

}
