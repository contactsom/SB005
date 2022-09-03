package com.simplilearn.mapping.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mapping.Customer;
import com.simplilearn.mapping.Order;
import com.simplilearn.utill.CHibernateUtill;

public class CustomerOrderClient {

	public static void main(String[] args) {
		
		Transaction tx = null;
		try {
			
			SessionFactory sf= CHibernateUtill.getSessionFactory();
			Session session= sf.openSession();
			tx = session.beginTransaction();
			
			Order o1= new Order(1, new Double (100), new Date(), "New");
			session.save(o1);
			
			Order o2= new Order(1, new Double (200), new Date(), "New");
			session.save(o2);
			
			Order o3= new Order(1, new Double (300), new Date(), "New");
			session.save(o3);
			
			
			Customer customer = new Customer("Subhash", "subhash@gmail.com", new Date(), new Long(908715));
			session.save(customer);
			
			/*All Order belongs to same Customer */
			o1.setCustomer(customer);
			o2.setCustomer(customer);
			o3.setCustomer(customer);
			
			/*Home Work*/
			/*From Customer Obj need to send the data to the Order Obj*/
			/*Convert it in to Uni-Directional*/
			
			
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
