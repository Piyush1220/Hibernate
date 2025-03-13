package com.client.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.account.model.Account;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction t =s.beginTransaction();
		
		Account ac= new Account("Raj",6430);
		s.save(ac);
		t.commit(); 
		s.close();
		System.out.println("Data Saved!!!");
	}

}
