package comm.example.model.table_per_concrete_class;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CDTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(CD.class)
					.addAnnotatedClass(SpecialEditionCD.class).addAnnotatedClass(InternationalCD.class)
					.buildSessionFactory();
			Session session = factory.openSession();
			CD cd = new CD("Under Pressure", "Rush", new Date(), 8.99);
			cd.setId(200);
			SpecialEditionCD secd = new SpecialEditionCD("Under Pressure", "Rush", new Date(), 8.99,
					"Widescreen");
			secd.setId(210);
			InternationalCD icd = new InternationalCD("Under Pressure", "Rush", new Date(), 8.99, "JPN", 4);
		icd.setId(220);
			session.getTransaction().begin();
			session.save(cd);
			session.save(secd);
			session.save(icd);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}