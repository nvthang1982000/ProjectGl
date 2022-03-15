package com.hcl.productManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Owner")
public class OwnerEntity {
	@Id
	@GeneratedValue
	@Column(name = "IdOwner")
	private int  IdOwner;
	
	@Column(name = "UserName", length = 50, nullable = false)
	private String UserName;
	
	@Column(name = "Pass", length = 50, nullable = false)
	private String Pass;
	
	@Column(name = "Fullname", length = 50, nullable = false)
	private String Fullname;
	
	@Column(name = "PhoneNumber", length = 10, nullable = false)
	private String PhoneNumber;
	
	@Column(name = "Email", length = 50, nullable = false)
	private String Email;
	
	

	public OwnerEntity() {
		super();
	}

	public OwnerEntity(int  idOwner, String userName, String pass, String fullname, String phoneNumber,
			String email) {
		super();
		IdOwner = idOwner;
		UserName = userName;
		Pass = pass;
		Fullname = fullname;
		PhoneNumber = phoneNumber;
		Email = email;
	}

	public int  getIdOwner() {
		return IdOwner;
	}

	public void setIdOwner(int  idOwner) {
		IdOwner = idOwner;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
