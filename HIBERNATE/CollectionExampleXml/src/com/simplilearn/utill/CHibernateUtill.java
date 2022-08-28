package com.simplilearn.utill;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CHibernateUtill {

	static SessionFactory factory;
	
	static {
		Configuration cfg= new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
