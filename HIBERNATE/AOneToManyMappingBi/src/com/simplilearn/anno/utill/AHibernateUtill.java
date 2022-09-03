package com.simplilearn.anno.utill;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AHibernateUtill {

	static SessionFactory factory;
	
	static {
		AnnotationConfiguration cfg= new AnnotationConfiguration();
		cfg=(AnnotationConfiguration)cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
