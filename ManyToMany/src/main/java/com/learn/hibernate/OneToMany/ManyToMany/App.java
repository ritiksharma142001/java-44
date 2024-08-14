package com.learn.hibernate.OneToMany.ManyToMany;

import java.util.ArrayList;
import java.util.List;

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
//    	//hibernate code
//    	Configuration cfg = new Configuration();
//    	cfg.configure();
//    	SessionFactory factory = cfg.buildSessionFactory();
//    	Session session = factory.openSession();
//    	Transaction tx = session.beginTransaction();
//    	
//    	Developer d1 = new Developer();
//    	Developer d2 = new Developer();
//    	Developer d3 = new Developer();
//    	Developer d4 = new Developer();
// 
//    	d1.setDev_ID(12);
//    	d1.setDev_Name("Mohan");
//    	
//    	d1.setDev_ID(13);
//    	d1.setDev_Name("Ram");
//    	
//    	d1.setDev_ID(14);
//    	d1.setDev_Name("Roshan");
//    	
//    	d1.setDev_ID(15);
//    	d1.setDev_Name("Aman");
//    	
//    	
//    	
//    	Project p1 = new Project();
//    	Project p2 = new Project();
//    	Project p3 = new Project();
//    	
//    	p1.setP_ID(123);
//    	p1.setP_Name("Project-A");
//    	
//    	p1.setP_ID(328);
//    	p1.setP_Name("Project-B");
//    	
//    	p1.setP_ID(439);
//    	p1.setP_Name("Project-C");
//    	
//    	List<Developer> devList1 = new ArrayList<Developer>();
//    	List<Developer> devList2 = new ArrayList<Developer>();
//    	List<Developer> devList3 = new ArrayList<Developer>();
//    	
//    	devList1.add(d1);
//    	devList1.add(d2);
//    	devList1.add(d4);
//    	
//    	devList2.add(d1);
//    	devList2.add(d2);
//    	devList2.add(d3);
//    	
//    	devList3.add(d2);
//    	devList3.add(d3);
//    	devList3.add(d4);
//    	
//    	List<Project> projectList1 = new ArrayList<Project>();
//    	List<Project> projectList2 = new ArrayList<Project>();
//    	List<Project> projectList3 = new ArrayList<Project>();
//    	List<Project> projectList4 = new ArrayList<Project>();
//
//    	projectList1.add(p1);
//    	projectList1.add(p2);
//    	
//    	projectList2.add(p1);
//    	projectList2.add(p2);
//    	projectList2.add(p3);
//    	
//    	projectList3.add(p2);
//    	projectList3.add(p3);
//    	
//    	projectList4.add(p1);
//    	projectList4.add(p3);
//    	
//    	d1.setProject(projectList1);
//    	d2.setProject(projectList2);
//    	d3.setProject(projectList3);
//    	d4.setProject(projectList4);
//
//    	p1.setDevelopers(devList1);
//    	p2.setDevelopers(devList1);
//    	p3.setDevelopers(devList1);
//    	
//    	session.save(d1);
//    	session.save(d2);
//    	session.save(d3);
//    	session.save(d4);
//    	session.save(p1);
//    	session.save(p2);
//
//    	
//    	tx.commit();
//    	System.out.println("All Objects are saved");
    	
    	// Hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        // Create Developers
        Developer d1 = new Developer();
        d1.setDev_ID(12);
        d1.setDev_Name("Mohan");
        
        Developer d2 = new Developer();
        d2.setDev_ID(13);
        d2.setDev_Name("Ram");
        
        Developer d3 = new Developer();
        d3.setDev_ID(14);
        d3.setDev_Name("Roshan");
        
        Developer d4 = new Developer();
        d4.setDev_ID(15);
        d4.setDev_Name("Aman");

        // Create Projects
        Project p1 = new Project();
        p1.setP_ID(123);
        p1.setP_Name("Project-A");

        Project p2 = new Project();
        p2.setP_ID(328);
        p2.setP_Name("Project-B");

        Project p3 = new Project();
        p3.setP_ID(439);
        p3.setP_Name("Project-C");

        // Set Relationships
        List<Developer> devList1 = new ArrayList<>();
        devList1.add(d1);
        devList1.add(d2);
        devList1.add(d4);

        List<Developer> devList2 = new ArrayList<>();
        devList2.add(d1);
        devList2.add(d2);
        devList2.add(d3);

        List<Developer> devList3 = new ArrayList<>();
        devList3.add(d2);
        devList3.add(d3);
        devList3.add(d4);

        List<Developer> devList4 = new ArrayList<>();
        devList4.add(d1);
        devList4.add(d3);

        List<Project> projectList1 = new ArrayList<>();
        projectList1.add(p1);
        projectList1.add(p2);

        List<Project> projectList2 = new ArrayList<>();
        projectList2.add(p1);
        projectList2.add(p2);
        projectList2.add(p3);

        List<Project> projectList3 = new ArrayList<>();
        projectList3.add(p2);
        projectList3.add(p3);

        List<Project> projectList4 = new ArrayList<>();
        projectList4.add(p1);
        projectList4.add(p3);

        d1.setProject(projectList1);
        d2.setProject(projectList2);
        d3.setProject(projectList3);
        d4.setProject(projectList4);

        p1.setDevelopers(devList1);
        p2.setDevelopers(devList2);
        p3.setDevelopers(devList3);
        
        // Save Developers and Projects
        session.save(d1);
        session.save(d2);
        session.save(d3);
        session.save(d4);
        session.save(p1);
        session.save(p2);
        session.save(p3);

        tx.commit();
        session.close();
        factory.close();
        
        System.out.println("All Objects are saved");
    }
}
