package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "hib_batsman")
public class Batsman extends Player {

		@Column
		private int runs;

		public Batsman() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Batsman(int pid,String pname,String team,int runs) {
			super(pid,pname,team);
			this.runs = runs;
		}

		public int getRuns() {
			return runs;
		}

		public void setRuns(int runs) {
			this.runs = runs;
		}
		
		
	
}
