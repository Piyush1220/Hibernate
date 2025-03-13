package com.hibernate.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.Book;

public class CriteriaClient {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Book.class);
		List<Book> blist=cr.list();
		
		System.out.println("All book are"+blist);
		
		cr.add(Restrictions.gt("price", 700.00));
		blist=cr.list();
		System.out.println("Book price>500 are"+blist);
		
		Criteria cr1=s.createCriteria(Book.class) ;
		cr1.add(Restrictions.like("author", "s__i%"));
		blist=cr1.list();
		System.out.println("Book author name with="+blist);
	}

}
