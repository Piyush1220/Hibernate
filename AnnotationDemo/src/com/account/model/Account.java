package com.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Myacc")
public class Account {
		
		@Id
		@GeneratedValue
		private int accNo;
		@Column
		private String name;
		@Column
		private double balance;
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Account(String name, double balance) {
			super();
			this.name = name;
			this.balance = balance;
		}
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
}
