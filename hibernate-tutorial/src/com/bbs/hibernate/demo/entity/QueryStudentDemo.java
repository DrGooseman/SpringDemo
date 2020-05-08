package com.bbs.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

	public static void main(String[] args) {


		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
	
		session.beginTransaction();
	
		List<Student> theStudents = session.createQuery("from Student").getResultList();
		
		displayStudents(theStudents);
		
		
		theStudents = session.createQuery("from Student s where "
				+ "s.lastName='Jenkins' OR s.firstName='Sally'").getResultList();
		
		System.out.println("\nStudents with the last name of Jenkins or first name of Sally:");
		displayStudents(theStudents);
		
		
		theStudents = session.createQuery("from Student s where "
				+ "s.email LIKE '%email.com'").getResultList();
		
		System.out.println("\nStudents with email that ends with 'email.com':");
		displayStudents(theStudents);
		
		session.getTransaction().commit();
		
		
		
		System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
