package com.simplilearn.astudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class StudentClientInsert {

	public static void main(String[] args) {

		SessionFactory factory;
		Transaction tx= null;
		try {
			//1. Create the Configuration Object
			AnnotationConfiguration cfg= new AnnotationConfiguration();
			System.out.println("1. Create the Configuration Object");
			
			//2. Call the Configure Object
			cfg=(AnnotationConfiguration)cfg.configure();
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
			//Student student = new Student("Noumya", "vikasdeshwal10@gmail.com", 986682, "Delhi", 980);
			//Student student = new Student("Subhash Jain", "subhashjain8029@gmail.com", 326338343, "Pune", 950);
			//Student student = new Student("Vinod", "vinod@gmail.com", 45678, "vzm", 678);
			//Student student = new Student("shubham", "shubhamgoyal@gmail.com", 45672, "szm", 672);
			Student student = new Student("Indu", "indu@gmail.com", 3334444, "visakhapatnam", 879);

			
			//7. Save the Data
			session.save(student);
			
			//8. Commit
			tx.commit();
			
			//9. Close the Resources
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		
		}
	
	}
}
