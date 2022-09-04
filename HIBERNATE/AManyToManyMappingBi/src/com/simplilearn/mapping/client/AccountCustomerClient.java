package com.simplilearn.mapping.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.anno.utill.AHibernateUtill;
import com.simplilearn.mapping.Account;
import com.simplilearn.mapping.Customer;

public class AccountCustomerClient {

	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			
			SessionFactory sf= AHibernateUtill.getSessionFactory();
			Session session= sf.openSession();
			tx = session.beginTransaction();
			
			Customer c1= new Customer("Rajive", "rajive@gmail.com", new Date(),new Long(12345));
			session.save(c1);
			Customer c2= new Customer("Indu", "indu@gmail.com", new Date(),new Long(22345));
			session.save(c2);
			
			
			Account a1= new Account("SAVING", 1000.0);
			session.save(a1);
			
			Account a2= new Account("CURRENT", 3000.0);
			session.save(a2);
			
			Account a3= new Account("CREDIT", 8000.0);
			session.save(a3);
			
			Set<Account> acc1= new HashSet<Account>();
			acc1.add(a1);
			acc1.add(a2);
			acc1.add(a3);
			c1.setAccount(acc1);
			
			Set<Account> acc2= new HashSet<Account>();
			acc2.add(a1);
			acc2.add(a2);
			c2.setAccount(acc2);
			
			
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
