package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "book_hql")
public class Book {

		@Id
		private int bid;
		@Column
		private String bname,author;
		@Column
		private double price;
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(int bid, String bname, String author, double price) {
			super();
			this.bid = bid;
			this.bname = bname;
			this.author = author;
			this.price = price;
		}
		@Override
		public String toString() {
			return "\n [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
		
}
