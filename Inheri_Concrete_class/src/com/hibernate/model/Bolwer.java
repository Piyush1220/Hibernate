package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "hbi_bolwer")
public class Bolwer extends Player {
	
	@Column
	private int wickets;

	
	public Bolwer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bolwer(int pid, String pname, String team,int w) {
		super(pid, pname, team);
		this.wickets=w;
		
		// TODO Auto-generated constructor stub
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	
	
}
