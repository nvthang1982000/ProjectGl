package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDPlace;
    @Column(name="IDCategories")
    private int iDCategories;
    @Column(name="Name")
    private String name;
    @Column(name="Detail")
    private String detail;
    @Column(name="Address")
    private String address;
    @Column(name="Ratting")
    private int ratting;
    @Column(name="Price")
    private int price;

    public int getIDPlace() {
        return this.IDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.IDPlace = IDPlace;
    }

    public int getIDCategories() {
        return this.iDCategories;
    }

    public void setIDCategories(int IDCategories) {
        this.iDCategories = IDCategories;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String Detail) {
        this.detail = Detail;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public int getRatting() {
        return this.ratting;
    }

    public void setRatting(int Ratting) {
        this.ratting = Ratting;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int Price) {
        this.price = Price;
    }


}
