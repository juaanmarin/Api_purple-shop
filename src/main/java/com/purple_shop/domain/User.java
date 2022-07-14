package com.purple_shop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "user_document")
	private long userDocument;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_number_phone")
	private String userNumberPhone;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_type")
	private String userType;
	
	@Column(name = "user_password")
	private String userPassword;

	public long getUserDocument() {
		return userDocument;
	}

	public void setUserDocument(long userDocument) {
		this.userDocument = userDocument;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumberPhone() {
		return userNumberPhone;
	}

	public void setUserNumberPhone(String userNumberPhone) {
		this.userNumberPhone = userNumberPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public User(long userDocument, String userName, String userNumberPhone, String userEmail, String userType,
			String userPassword) {
		super();
		this.userDocument = userDocument;
		this.userName = userName;
		this.userNumberPhone = userNumberPhone;
		this.userEmail = userEmail;
		this.userType = userType;
		this.userPassword = userPassword;
	}

	public User() {
		super();
	}
	
}
