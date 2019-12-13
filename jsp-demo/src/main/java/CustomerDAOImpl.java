

import java.util.List;

import org.hibernate.Session;

public class CustomerDAOImpl implements CustomerDAO {

	private Session session = null;
	List<Customer> list;
	public List<Customer> getAllCustomer() {
try {
	session = HibernateFactory.getSessionFactory().openSession();
	session.getTransaction().begin();
	list = session.createQuery("from Customer", Customer.class).getResultList();
	session.getTransaction().commit();
	
	
} catch (Exception e) {
	// TODO: handle exception
}
		return list;
	}

}
