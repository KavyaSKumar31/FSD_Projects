package comm.example.dao;

import java.util.List;

import comm.example.model.Customer;

public interface CustomerDAO {
	
	public void createCustomer(Customer customer);
	public List<Customer> getAllCustomer();

}
