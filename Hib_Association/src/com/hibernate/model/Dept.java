package com.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "hib_dept_otm")
public class Dept {

	@Id
	private int did;
	@Column
	private String dname;
	
	@OneToMany (mappedBy = "dept",
				targetEntity = Emp.class,
				cascade = CascadeType.ALL)
	
	
	private List<Emp> elist;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Emp> getElist() {
		return elist;
	}

	public void setElist(List<Emp> elist) {
		this.elist = elist;
	}	

	
	
}
