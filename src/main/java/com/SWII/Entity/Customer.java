package com.SWII.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	private String userName;
	private String fristName;
	private String secoundName;
	private String password;
	
	
	
	
	public Customer(String userName, String fristName, String secoundName, String password) {
		super();
		this.userName = userName;
		this.fristName = fristName;
		this.secoundName = secoundName;
		this.password = password;
	}
	
	public Customer() {
		this.userName ="";
		this.fristName="";
		this.secoundName="";
		this.password="";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getSecoundName() {
		return secoundName;
	}
	public void setSecoundName(String secoundName) {
		this.secoundName = secoundName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", fristName=" + fristName + ", secoundName=" + secoundName
				+ ", password=" + password + "]";
	}

}
