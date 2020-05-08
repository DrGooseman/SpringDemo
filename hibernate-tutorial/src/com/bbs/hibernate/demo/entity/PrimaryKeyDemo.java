package com.bbs.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			// create 3 student objects
		System.out.println("Creating 3 student object");
		Student tempStudent1 = new Student("Hammy", "Jenkins", "Hammy@email.com");
		Student tempStudent2 = new Student("John", "Doe", "John@email.com");
		Student tempStudent3 = new Student("Bobb", "Cobb", "Bobb@email.com");
		
		session.beginTransaction();
		
		System.out.println("Saving the students...");
		session.save(tempStudent1);
		session.save(tempStudent2);
		session.save(tempStudent3);
		
		session.getTransaction().commit();
		
		System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
	}

}
