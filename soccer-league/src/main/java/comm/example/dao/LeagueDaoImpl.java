package comm.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import comm.example.factory.HibernateUtilFactory;
import comm.example.model.League;

public class LeagueDaoImpl implements LeagueDao {

	private Session session = null;
	private SessionFactory factory = null;
	
	{
		factory = HibernateUtilFactory.getSessionFactory();
	}

	public void createLeague(League league) {
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			session.persist(league);
			session.getTransaction().commit();

		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<League> getAllLeague() {
		// TODO Auto-generated method stub
	List<League> list=null;
		try {
			session=factory.openSession();
			session.getTransaction().begin();
			list=session.createQuery("from League").getResultList();
		} finally {
			session.close();
		}
		
		return list;
	}

}
