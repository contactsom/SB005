package com.simplilearn.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.anno.utill.AHibernateUtill;


public class StudentAddressClient {

	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			
			SessionFactory sf= AHibernateUtill.getSessionFactory();
			Session session= sf.openSession();
			tx = session.beginTransaction();
			
			Address address = new Address("3rd Cross", "Bangalore", "KA");
			Student student = new Student("Rahul Kumar", "rahulkumar@gmial.com", "9876123", address); /* Student has Address */
			
			session.save(student);
			session.save(address);
			
			tx.commit();
			session.close();
			
			
		} catch (Exception e) {

			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}
}
