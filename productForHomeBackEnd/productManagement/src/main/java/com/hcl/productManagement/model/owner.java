package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDOwner;
    private String Username;
    private String Password;
    private String Name;
    private String Email;
    private String Phone;
    private String Image;

    public int getIDOwner() {
        return this.IDOwner;
    }

    public void setIDOwner(int IDOwner) {
        this.IDOwner = IDOwner;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getImage() {
        return this.Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

}
