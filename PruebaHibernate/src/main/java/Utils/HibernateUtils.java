package Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    public static SessionFactory sessionFactory;

        static{
            try {
                Configuration configuration = new Configuration();
                configuration.configure("/hibernate.cfg.xml");
                sessionFactory= configuration.buildSessionFactory();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            }
        public static SessionFactory getSessionFactory(){

            return sessionFactory;
        }


    }

