package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDPlace;
    private int IDCategories;
    private String Name;
    private String Detail;
    private String Address;
    private int Ratting;
    private int Price;

    public int getIDPlace() {
        return this.IDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.IDPlace = IDPlace;
    }

    public int getIDCategories() {
        return this.IDCategories;
    }

    public void setIDCategories(int IDCategories) {
        this.IDCategories = IDCategories;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDetail() {
        return this.Detail;
    }

    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getRatting() {
        return this.Ratting;
    }

    public void setRatting(int Ratting) {
        this.Ratting = Ratting;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }


}
