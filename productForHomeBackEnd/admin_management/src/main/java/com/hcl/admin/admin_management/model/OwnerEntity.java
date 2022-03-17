package com.hcl.admin.admin_management.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Owner")
public class OwnerEntity {
	@Id
	@GeneratedValue
	@Column(name = "IdOwner")
	private int  idOwner;
	
	@Column(name = "UserName", length = 50, nullable = false)
	private String userName;
	
	@Column(name = "Pass", length = 50, nullable = false)
	private String pass;
	
	@Column(name = "Fullname", length = 50, nullable = false)
	private String fullName;
	
	@Column(name = "PhoneNumber", length = 10, nullable = false)
	private String phoneNumber;
	
	@Column(name = "Email", length = 50, nullable = false)
	private String email;

	@Column(name = "Image", nullable = false)
	private String image;

	public String getImage() {
		return this.image;
	}

	public void setImage(String Image) {
		this.image = Image;
	}
	
	
	

	public OwnerEntity() {
		super();
	}

	public OwnerEntity(int  idowner, String username, String passs, String fullname, String phonenumber,
			String emaill, String imagee) {
		super();
		idOwner = idowner;
		userName = username;
		pass = passs;
		fullName = fullname;
		phoneNumber = phonenumber;
		email = emaill;
		image = imagee;
	}

	public int  getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(int  idowner) {
		idOwner = idowner;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		userName = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String passs) {
		pass = passs;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullname) {
		fullName = fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phonenumber) {
		phoneNumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emaill) {
		email = emaill;
	}

	@Transient
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    } 
		
}
