package comm.example.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private SessionFactory factory = null;
	private Session session;

	{
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
				.buildSessionFactory();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		session = factory.openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("from Customer", Customer.class);
		List<Customer> list = query.getResultList();
		session.getTransaction().commit();
		return list;
	}

}
