package comm.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.springdemo.entity.Customer;
import comm.example.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerControllerRest {
	@Autowired
	private CustomerService customerService;
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return customerService.getCustomers();
	}

}
