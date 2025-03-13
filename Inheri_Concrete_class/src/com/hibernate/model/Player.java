package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Player {

	@Id
	private int pid;
	@Column
	private String pname,team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int pid, String pname, String team) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.team = team;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
}
