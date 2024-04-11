package prod_info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Edittable {
	
public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction ts=session.beginTransaction();
		
		Product1 c= session.get(Product1.class, 1);
		c.setItem("pen");
		
		ts.commit();
		System.out.println("Data edited successfully");
	}

}
