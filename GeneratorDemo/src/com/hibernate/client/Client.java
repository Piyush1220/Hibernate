package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Student;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction t= s.beginTransaction();
		
		Student s1=new Student("Dhoni",77);
		
		s.save(s1);
		t.commit();
		System.out.println("Data Saved...!");
		s.close();
		

	}

}
