package com.hcl.admin.admin_management.model;


import javax.persistence.*;

@Entity
@Table(name = "User")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "IdUser")
	private int  idUser;
	
	@Column(name = "UserName", length = 50, nullable = false)
	private String userName;
	
	@Column(name = "Pass", length = 50, nullable = false)
	private String pass;
	
	@Column(name = "FullName", length = 50, nullable = false)
	private String fullName;
	
	@Column(name = "Gender", length = 10, nullable = false)
	private String gender;
	
	@Column(name = "PhoneNumber", length = 10, nullable = false)
	private String phoneNumber;
	
	@Column(name = "Email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "Address", nullable = false)
	private String address;

	@Column(name = "Image", nullable = false)
	private String image;

	public String getImage() {
		return this.image;
	}

	public void setImage(String Image) {
		this.image = Image;
	}

	public UserEntity() {
		super();
	}

	public UserEntity(int  idUserr, String userNamee, String passs, String fullNamee, String genderr, String phoneNumberr,
			String emaill, String addresss, String imagee) {
		super();
		idUser = idUserr;
		userName = userNamee;
		pass = passs;
		fullName = fullNamee;
		gender = genderr;
		phoneNumber = phoneNumberr;
		email = emaill;
		address = addresss;
		image = imagee;
	}

	public int  getIdUser() {
		return idUser;
	}

	public void setIdUser(int  idUserr) {
		idUser = idUserr;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userNamee) {
		userName = userNamee;
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

	public void setFullName(String fullNamee) {
		fullName = fullNamee;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String genderr) {
		gender = genderr;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumberr) {
		phoneNumber = phoneNumberr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emaill) {
		email = emaill;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String addresss) {
		address = addresss;
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
