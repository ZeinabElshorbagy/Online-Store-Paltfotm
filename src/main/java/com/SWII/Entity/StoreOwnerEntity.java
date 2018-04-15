package com.SWII.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class StoreOwnerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ownerId;
	
	@Column(unique=true)
	private String userName;
	private String fristName;
	private String secoundName;
	private String password;
	private String address;
	private String phoneNumber;

	
	/* @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "storeOwner")
	 private Set<StoreEntity> storeEntities = new HashSet<>();*/

	public StoreOwnerEntity(int ownerId, @UniqueElements String userName, String fristName, String secoundName,
	String password, String address, String phoneNumber) {
		
super();
this.ownerId = ownerId;
this.userName = userName;
this.fristName = fristName;
this.secoundName = secoundName;
this.password = password;
this.address = address;
this.phoneNumber = phoneNumber;
}
// 
	
//	public StoreOwnerEntity(int ownerId, @UniqueElements String userName, String fristName, String secoundName,
//			String password, String address, String phoneNumber, Set<StoreEntity> storeEntities) {
//		super();
//		this.ownerId = ownerId;
//		this.userName = userName;
//		this.fristName = fristName;
//		this.secoundName = secoundName;
//		this.password = password;
//		this.address = address;
//		this.phoneNumber = phoneNumber;
//		this.storeEntities = storeEntities;
//	}

	public StoreOwnerEntity() {
		super();
		this.userName = "";
		this.fristName = "";
		this.secoundName = "";
		this.password = "";
		this.address = "";
		this.phoneNumber = "";
	//	this.storeEntities = null;
	}
	
	
	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
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

//	public Set<StoreEntity> getStoreEntities() {
//		return storeEntities;
//	}
//
//	public void setStoreEntities(Set<StoreEntity> storeEntities) {
//		this.storeEntities = storeEntities;
//	}



}
