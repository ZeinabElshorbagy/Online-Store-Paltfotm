package com.SWII.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StoreOwnerEntity {
	@Id
	private String userName;
	private String fristName;
	private String secoundName;
	private String password;
	private String address;
	private String phoneNumber;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public StoreOwnerEntity() {
		super();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public StoreOwnerEntity(String userName, String fristName, String secoundName, String password, String address,
			String phoneNumber) {
		super();
		this.userName = userName;
		this.fristName = fristName;
		this.secoundName = secoundName;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
}
