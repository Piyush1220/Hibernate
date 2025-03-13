package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Batsman;
import com.hibernate.model.Bolwer;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t =s.beginTransaction();
		
		Batsman bt=new Batsman(1,"SAI","Ind",724);
		Bolwer bw=new Bolwer(2,"Yash","Ind",100);
		
		s.save(bt);
		s.save(bw);
		
		t.commit();
		s.close();
		System.out.println("successfull Insert");

	}

}
