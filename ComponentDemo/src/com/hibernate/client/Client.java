package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Address;
import com.hibernate.model.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cgf=new Configuration();
		cgf.configure("hibernate.cgf.xml");
		
		SessionFactory sf=cgf.buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction t= s.beginTransaction();
		Address a=new Address("Pune", "MH", "India");
		Employee e=new Employee("Abhay",a);
		
		s.save(e);
		t.commit();
		System.out.println("Data Saved!!!");
		s.close();
		
	}

}
