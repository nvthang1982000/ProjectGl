package com.hcl.productManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "IdUser")
	private int  IdUser;
	
	@Column(name = "UserName", length = 50, nullable = false)
	private String UserName;
	
	@Column(name = "Pass", length = 50, nullable = false)
	private String Pass;
	
	@Column(name = "FullName", length = 50, nullable = false)
	private String FullName;
	
	@Column(name = "Gender", length = 10, nullable = false)
	private String Gender;
	
	@Column(name = "PhoneNumber", length = 10, nullable = false)
	private String PhoneNumber;
	
	@Column(name = "Email", length = 50, nullable = false)
	private String Email;
	
	@Column(name = "Address", nullable = false)
	private String Address;

	public UserEntity() {
		super();
	}

	public UserEntity(int  idUser, String userName, String pass, String fullName, String gender, String phoneNumber,
			String email, String address) {
		super();
		IdUser = idUser;
		UserName = userName;
		Pass = pass;
		FullName = fullName;
		Gender = gender;
		PhoneNumber = phoneNumber;
		Email = email;
		Address = address;
	}

	public int  getIdUser() {
		return IdUser;
	}

	public void setIdUser(int  idUser) {
		IdUser = idUser;
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

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
}
