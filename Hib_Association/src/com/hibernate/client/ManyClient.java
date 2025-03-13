package com.hibernate.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Dept;
import com.hibernate.model.Emp;

public class ManyClient {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hib.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t =s.beginTransaction();
		
		Dept d1=new Dept(101,"HR");
		Dept d2=new Dept(102,"sales");
		
		List<Emp> elits= new ArrayList<Emp>();
		
		elits.add(new Emp(1,"abc",d1));
		elits.add(new Emp(2,"pqr",d1));
		
		List<Emp> elist1=new ArrayList<Emp>();
		
		elist1.add(new Emp(3,"XYZ",d2));
		elist1.add(new Emp(4,"ASD",d2));
		
		d1.setElist(elits);
		d2.setElist(elist1);
		
		s.save(d1);
		s.save(d2);
		
		t.commit();
		s.close();
		System.out.println("Data Inseted!!!...");

	}

}
