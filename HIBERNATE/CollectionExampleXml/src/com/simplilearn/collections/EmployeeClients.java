package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.utill.CHibernateUtill;

public class EmployeeClients {

	public static void main(String[] args) {
	
		Transaction tx = null;
		try {
			
			SessionFactory sf= CHibernateUtill.getSessionFactory();
			Session session=sf.openSession();
			tx = session.beginTransaction();
			
			String[] empcourse={"JAVA","JDBC","HIBERNATE","JSP"};
			
			List<String> empemails = new ArrayList<String>();
			empemails.add("a@gmail.com");
			empemails.add("b@gmail.com");
			empemails.add("c@gmail.com");
			empemails.add("d@gmail.com");
			
			List<Integer> empmarks = new ArrayList<Integer>();
			empmarks.add(50);
			empmarks.add(60);
			empmarks.add(70);
			empmarks.add(80);
			
			Set<Long> empphone = new HashSet<Long>();
			empphone.add(new Long(1234));
			empphone.add(new Long(1235));
			empphone.add(new Long(1236));
			empphone.add(new Long(1237));
			
			Map<String,Long> empreferance	= new HashMap<String, Long>();
			empreferance.put("Akhil", new Long(9134)); // name - phone
			empreferance.put("Lokesh", new Long(9234)); // name - phone
			empreferance.put("Dilip", new Long(9334)); // name - phone
			empreferance.put("Mohit", new Long(9434)); // name - phone
					
			
		     Employee employee= new Employee("Deepak Sharma", "03031988", "MCA", empcourse, empemails, empmarks, empphone, empreferance);
			
			session.save(employee);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			System.err.println("Exception occured while inserting the Employee Data");
			e.printStackTrace();
			
		}

	}
}
