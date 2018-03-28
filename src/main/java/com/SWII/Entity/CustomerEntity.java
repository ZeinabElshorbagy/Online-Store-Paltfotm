package com.SWII.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CustomerEntity {
	@Id
	private String userName;
	private String email;
	private String fristName;
	private String secoundName;
	private String password;
	
	
	
	

<<<<<<< HEAD

=======
>>>>>>> 90701378de76dac987df6374b782d808f9bbbcb2
	public CustomerEntity(String userName, String email, String fristName, String secoundName, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.fristName = fristName;
		this.secoundName = secoundName;
		this.password = password;
	}
	public CustomerEntity() {
		super();
		this.userName = "";
		this.email = "";
		this.fristName = "";
		this.secoundName = "";
		this.password = "";
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
