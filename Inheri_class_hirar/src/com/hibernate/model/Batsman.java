package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "batsman")
public class Batsman extends Player {
		@Column
		private int runs;

		public Batsman() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Batsman(int pid,String name,String team, int runs) {
			super(pid,name,team);
			this.runs = runs;
		}

		public int getRuns() {
			return runs;
		}

		public void setRuns(int runs) {
			this.runs = runs;
		}

		
		
		
}
