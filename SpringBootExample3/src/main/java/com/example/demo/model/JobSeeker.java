package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class JobSeeker {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String name;
		private String email;
		private long mobile;
		public JobSeeker(int id, String name, String email, long mobile) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.mobile = mobile;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public JobSeeker() {
			
		}
		
}
