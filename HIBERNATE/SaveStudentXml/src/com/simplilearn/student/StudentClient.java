package com.simplilearn.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentClient {

	public static void main(String[] args) {
		SessionFactory factory;
		Transaction tx= null;
		
	try {
		//1. Create the Configuration Object
		Configuration cfg= new Configuration();
		System.out.println("1. Create the Configuration Object");
		
		//2. Call the Configure Object
		cfg=cfg.configure();
		System.out.println("2. Call the Configure Object");
		
		//3. Through the Configuration object call the buildSessionFactory
		factory=cfg.buildSessionFactory();
		System.out.println("3.Through the Configuration object call the buildSessionFactory");
		
		//4. With the factory object open the session
		Session session=factory.openSession();
		System.out.println("4. With the factory object open the session");
		
		//5. With the help of Session need to begin the transaction
		tx=session.beginTransaction();
		System.out.println("5. With the help of Session need to begin the transaction");
		
		//6. Business Object
		System.out.println(" Business Object Prepared");
		Student student = new Student("Vicky", "@abc", 6302);
		
		//7. Save the Data
		session.save(student);
		
		//8. Commit in to DB
		tx.commit();
		System.out.println("Commit in to DB");
		
	} catch (Exception e) {
		e.printStackTrace();
		if(tx!=null) {
			tx.rollback();
		}			
	}

	}
}
