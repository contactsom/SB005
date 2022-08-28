package com.simplilearn.ahibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class CustomerClient {
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
			//Customer customer = new Customer("Subhash Jain", "subhash@abc.com", 89377, "Bangalore", 960);
			//Customer customer = new Customer("Anil Rawat", "anil@abc.com", 90000, "Delhi", 1002);
			  Customer customer = new Customer("rakesh", "rakesh@abc.com", 89377, "Pune", 960);


					
			//7. Save the Data
			session.save(customer);
			
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
