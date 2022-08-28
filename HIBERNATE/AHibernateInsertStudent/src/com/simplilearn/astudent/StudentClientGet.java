package com.simplilearn.astudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class StudentClientGet {

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
			
			//6. Fetch the data from the DB for respective PK
			Student student1=(Student)session.get(Student.class, 1);
			Student student2=(Student)session.get(Student.class, 2);
			
			System.out.println("*************STUDENT_ID=1****************");
			System.out.println(
							"STUDENT ID : "+student1.getStuid()+"\n "+
							"STUDENT NAME :"+student1.getStuname()+"\n "+
							"STUDENT EMAIL :"+student1.getStuemail()+"\n "+
							"STUDENT PHONE :"+student1.getStuphone()+"\n "+
							"STUDENT MARKS :"+student1.getStumarks()+"\n "+
							"STUDENT CITY :"+student1.getStucity()
							);
			
			System.out.println("**************STUDENT_ID=2***************");
			System.out.println(
							"STUDENT ID : "+student2.getStuid()+"\n "+
							"STUDENT NAME :"+student2.getStuname()+"\n "+
							"STUDENT EMAIL :"+student2.getStuemail()+"\n "+
							"STUDENT PHONE :"+student2.getStuphone()+"\n "+
							"STUDENT MARKS :"+student2.getStumarks()+"\n "+
							"STUDENT CITY :"+student2.getStucity()
							);
			//7. Close the Resources
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		
		}
	
	}
}
