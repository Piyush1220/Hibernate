package com.hibernate.client;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.model.Book;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t;
		Query q;
		
		String ans="";
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Menu\n1)Insert Book\n2)Update Book\n3)Delete Book\n4)Show All");
			
			System.out.println("enter you choice");
			int ch=sc.nextInt();
			Book b=new Book();
			
			switch (ch) {
			case 1:	
					System.out.println("enter book bid");
					b.setBid(sc.nextInt());
					
					System.out.println("enter book name");
					sc.nextLine();
					b.setBname(sc.nextLine());
					
					System.out.println("enter Book author");
					b.setAuthor(sc.nextLine());
					
					System.out.println("enter book price");
					b.setPrice(sc.nextDouble());
					
					t=s.beginTransaction();
					s.save(b);
					t.commit();
					System.out.println("record Insert");
					break;
			case 2:
					System.out.println("Enter Bid to update");
					int id=sc.nextInt();
				
					System.out.println("Enter new book Name");
					sc.nextLine();
					String name=sc.nextLine();
				
					System.out.println("Enter new Author");
					String author=sc.nextLine();
				
					System.out.println("Enter new  Price");
					double price=sc.nextDouble();
				
					t=s.beginTransaction();
					q=s.createQuery("update Book set bname=:nm,author=:au,price=:p where bid=:i ");
					q.setParameter("nm", name);
					q.setParameter("au", author);
					q.setParameter("p", price);
					q.setParameter("i", id);
				
					int r=q.executeUpdate();
					if(r>0)
					{
						t.commit();
						System.out.println("Record Update..");
					}
					else
					{
						System.out.println("Record not found");
					
					}
					break;
			case 3:
					System.out.println("Enter Bid to delete");
					id=sc.nextInt();
							
					t=s.beginTransaction();
					q=s.createQuery("delete from Book where bid=:i");
					q.setParameter("i", id);
				
					r= q.executeUpdate();
					if(r>0)
					{
							t.commit();
							System.out.println("Record Deleted..");
					}
					else
						System.out.println("Record not FOUND..");
					break;	
			case 4:
				 q=s.createQuery("from Book");
				//q.setFirstResult(2);
				//q.setMaxResults(2);
				List<Book> blist= q.list();
				
				System.out.println("Book List is "+blist);
					
			default:
				System.out.println("Invalid choice..");
				break;
			}
			System.out.println("Do u want to continue?(y/n)");
			ans=sc.next();
		}while(ans.equals("y") || ans.equals("Y"));
		
		s.close();
	}

}
