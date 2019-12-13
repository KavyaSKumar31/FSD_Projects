package com.example.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public class RabbitMQConsumerService {
	private static final String QUEUE = "foo.queue";

	@RabbitListener(queues = QUEUE)
	public void receiveMessage(Employee employee) {
		System.out.println("Received Message from foo-queue Queue >>" + employee);
	}
}
