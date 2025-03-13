package com.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("client.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		//Employee e=new Employee(1,"Abc",457108);
		Employee e=new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Employee Details....");
		System.out.println("enter the ID:");
		
		e.setId(sc.nextInt());
		 
		
		System.out.println("enter the employee name:");
		sc.nextLine();
		e.setName(sc.nextLine());
		
		System.out.println("enter the Salary:");
		e.setSalary(sc.nextDouble());
				
				
		s.save(e);
		
		
		t.commit();
		
		s.close();
		
		System.out.println("Data Save!!!");
		
	}

}
