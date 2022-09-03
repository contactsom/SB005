package com.simplilearn.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.utill.CHibernateUtill;

public class StudentAddressClient {

	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			
			SessionFactory sf= CHibernateUtill.getSessionFactory();
			Session session= sf.openSession();
			tx = session.beginTransaction();
			
			/*
			Address address = new Address("3rd Cross", "Bangalore", "KA");
			session.save(address);*/
			
			 /*Address Obje in to Student Obj
       		   Student has Address */
			
			/*Student student = new Student("Rahul Kumar", "rahulkumar@gmial.com", "9876123", address); 
			session.save(student);
			*/
		
			
			Student student1 = new Student("Mohan Kumar", "Mohan@gmial.com", "9836123"); /* Student has Address */
			session.save(student1);
			
			
			Address address1 = new Address("3rd Cross", "Hyderabad", "TS",student1);
			session.save(address1);
			
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
