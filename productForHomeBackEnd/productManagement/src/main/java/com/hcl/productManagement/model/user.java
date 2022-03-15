package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDUser;
    @Column(name="Username")
    private String username;
    @Column(name="Password")
    private String password;
    @Column(name="Name")
    private String name;
    @Column(name="Email")
    private String email;
    @Column(name="Phone")
    private String Phone;
    @Column(name="Image")
    private String image;

    public int getIDUser() {
        return this.IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String Image) {
        this.image = Image;
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
