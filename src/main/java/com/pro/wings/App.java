package com.pro.wings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Student std1 = new Student(10,"Ram","Ayodhya");
    	Student std2 = new Student(20,"Ravan","Lanka");

    	Session session1 = factory.openSession();
//    	session1.save(std1);
//    	session1.persist(std2);
    	
    	System.out.println(session1.get(Student.class, 10));
    	
    	session1.close();
    	
    	Session session2 = factory.openSession();
    	System.out.println(session2.get(Student.class, 10));
    	
    	session2.close();
    	factory.close();
    }
}
