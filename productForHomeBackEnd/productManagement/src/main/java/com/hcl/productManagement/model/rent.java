package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDRent;
    @Column(name="IDUser")
    private int iDUser;
    @Column(name="IDOwner")
    private int iDOwner;
    @Column(name="IDPlace")
    private int iDPlace;
    @Column(name="Datestart")
    private String datestart;
    @Column(name="Dateend")
    private String dateend;

    public int getIDRent() {
        return this.IDRent;
    }

    public void setIDRent(int IDRent) {
        this.IDRent = IDRent;
    }

    public int getIDUser() {
        return this.iDUser;
    }

    public void setIDUser(int IDUser) {
        this.iDUser = IDUser;
    }

    public int getIDOwner() {
        return this.iDOwner;
    }

    public void setIDOwner(int IDOwner) {
        this.iDOwner = IDOwner;
    }

    public int getIDPlace() {
        return this.iDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.iDPlace = IDPlace;
    }

    public String getDatestart() {
        return this.datestart;
    }

    public void setDatestart(String Datestart) {
        this.datestart = Datestart;
    }

    public String getDateend() {
        return this.dateend;
    }

    public void setDateend(String Dateend) {
        this.dateend = Dateend;
    }

    

}
