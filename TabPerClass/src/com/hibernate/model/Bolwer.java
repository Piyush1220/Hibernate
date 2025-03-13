package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "tab_bolw")
@PrimaryKeyJoinColumn
public class Bolwer extends Player {
	
	@Column
	private int w;
	public Bolwer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bolwer(int pid, String name, String team,int w) {
		super(pid, name, team);
		this.w=w;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	
	
	
}
