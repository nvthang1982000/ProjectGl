package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDRent;
    private int IDUser;
    private int IDOwner;
    private int IDPlace;
    private String Datestart;
    private String Dateend;

    public int getIDRent() {
        return this.IDRent;
    }

    public void setIDRent(int IDRent) {
        this.IDRent = IDRent;
    }

    public int getIDUser() {
        return this.IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public int getIDOwner() {
        return this.IDOwner;
    }

    public void setIDOwner(int IDOwner) {
        this.IDOwner = IDOwner;
    }

    public int getIDPlace() {
        return this.IDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.IDPlace = IDPlace;
    }

    public String getDatestart() {
        return this.Datestart;
    }

    public void setDatestart(String Datestart) {
        this.Datestart = Datestart;
    }

    public String getDateend() {
        return this.Dateend;
    }

    public void setDateend(String Dateend) {
        this.Dateend = Dateend;
    }

    

}
