package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "hib_ply")
@Inheritance (strategy = InheritanceType.JOINED)
public class Player {

		@Id
		private int pid;
		@Column
		private String name,team;
		public Player() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Player(int pid, String name, String team) {
			super();
			this.pid = pid;
			this.name = name;
			this.team = team;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		
		
}
