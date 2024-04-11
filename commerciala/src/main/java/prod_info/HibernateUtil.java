package prod_info;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static SessionFactory sessionfactroy=null;
	public static SessionFactory buildSessionFactory() {
		
		if(sessionfactroy!=null) {
			sessionfactroy=null;
		}
		Configuration cfg=new Configuration()
		
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product1.class);
		sessionfactroy=cfg.buildSessionFactory();
		return sessionfactroy;
				
	}

}
