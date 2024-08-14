package com.learn.hibernate.OneToMany.Vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main(String[] args)
    {
        // Load configuration and build session factory
        Configuration cfg = new Configuration();
        cfg.configure(); // Ensure this loads the hibernate.cfg.xml
        SessionFactory factory = cfg.buildSessionFactory();

        // Open session
        Session session = factory.openSession();
        
        // Begin transaction
        Transaction transaction = session.beginTransaction();
        
        // Create objects of Bike
        Bike bk1 = new Bike();
        bk1.setBk_id(1);
        bk1.setBk_brand("Hero");
        
        Bike bk2 = new Bike();
        bk2.setBk_id(2);
        bk2.setBk_brand("KTM");
        
        // Create objects of Rider & assign bikes
        Rider rd1 = new Rider(101, "Ritik", bk1);
        Rider rd2 = new Rider(102, "Amit", bk1);
        Rider rd3 = new Rider(103, "Manoj", bk2);
        Rider rd4 = new Rider(104, "Mohit", bk2);
        Rider rd5 = new Rider(105, "Ronit", bk2);
        
        // Create lists for riders
        List<Rider> rdList1 = new ArrayList<>();
        rdList1.add(rd1);
        rdList1.add(rd2);
        
        List<Rider> rdList2 = new ArrayList<>();
        rdList2.add(rd3);
        rdList2.add(rd4);
        rdList2.add(rd5);
        
        // Assign rider lists to bikes
        bk1.setRider(rdList1);
        bk2.setRider(rdList2);

        // Save objects
        session.save(bk1);
        session.save(bk2);
        session.save(rd1);
        session.save(rd2);
        session.save(rd3);
        session.save(rd4);
        session.save(rd5);

        // Commit transaction
        transaction.commit();
        System.out.println("All objects are saved");

        // Close session and factory
        session.close();
        factory.close();
    }
}
