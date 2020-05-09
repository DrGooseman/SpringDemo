package com.bbs.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
		System.out.println("Creating new student object");
		Student tempStudent = new Student("Sally", "Butterball", "Sally@email.com");
		
		session.beginTransaction();
		
		System.out.println("Saving the student...");
		System.out.println(tempStudent);
		session.save(tempStudent);
		
		session.getTransaction().commit();
		
		
		System.out.print("Saved student. Generated id: " + tempStudent.getId());
		
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		System.out.println("\nGetting student with id: " + tempStudent.getId());
		
		Student myStudent = session.get(Student.class, tempStudent.getId());
		
		System.out.println("Get complete: " + myStudent);
		
		session.getTransaction().commit();
		
		System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
	}

}
