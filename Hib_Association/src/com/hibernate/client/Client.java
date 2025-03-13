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
		
		Employee e=new Employee(1,"Abc");
		Address ad=new Address(1,"Pune","MH","India");
		
		e.setAddr(ad);
		ad.setEmployee(e);
		
		Configuration cgf=new Configuration();
		cgf.configure("hibernate.cfg.xml");
		SessionFactory sf=cgf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		s.save(e);
		s.save(ad);
		
		t.commit();
		s.close();
		System.out.println("Data Saved...!!!");
		
	}

}
