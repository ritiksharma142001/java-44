package com.learn.hibernate.Computer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //object creation
    	Charger c1 = new Charger();
    	Charger c2 = new Charger();

    	Laptop l1 = new Laptop(1, "Dell", 33999, c1);
    	Laptop l2 = new Laptop(2, "lenovo", 40999, c2);
    	
    	c1.setChargerId(1001);
    	c1.setChargerBrandString("Charger 1");
    	c1.setChargerPrice(7888);
    	c1.setLaptop(l1);
    	
    	c2.setChargerId(2002);
    	c2.setChargerBrandString("Charger 2");
    	c2.setChargerPrice(788);
    	c2.setLaptop(l2);

    	
    	//hibernate code
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	//save object
    	session.save(c1);
    	session.save(c2);
    	session.save(l1);
    	session.save(l2);
    	
    	//commit transaction
    	tx.commit();

    	
    	
    }
}
