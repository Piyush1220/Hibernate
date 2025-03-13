package com.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Bolwer bw=new Bolwer(2,"AMS","IND",71);
		Batsman bt=new Batsman(3,"SD","IND",432);
		s.save(bt);
		s.save(bw);
		t.commit();
		s.close();
		System.out.println("Data Saved...!!!");
		
	}

}
