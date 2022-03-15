package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDOwner;
    @Column(name="Username")
    private String username;
    @Column(name="Password")
    private String password;
    @Column(name="Name")
    private String name;
    @Column(name="Email")
    private String email;
    @Column(name="Phone")
    private String phone;
    @Column(name="Image")
    private String image;

    public int getIDOwner() {
        return this.IDOwner;
    }

    public void setIDOwner(int IDOwner) {
        this.IDOwner = IDOwner;
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
        return this.phone;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String Image) {
        this.image = Image;
    }

}
