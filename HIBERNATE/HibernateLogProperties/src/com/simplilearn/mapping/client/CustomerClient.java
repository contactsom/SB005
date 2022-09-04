package com.simplilearn.mapping.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mapping.Customer;
import com.simplilearn.utill.CHibernateUtill;

public class CustomerClient {

	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			
			SessionFactory sf= CHibernateUtill.getSessionFactory();
			Session session= sf.openSession();
			tx = session.beginTransaction();
			
			Customer c1= new Customer("Rajive", "rajive@gmail.com", new Date(),new Long(12345));
			session.save(c1);
			Customer c2= new Customer("Indu", "indu@gmail.com", new Date(),new Long(22345));
			session.save(c2);
			
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
