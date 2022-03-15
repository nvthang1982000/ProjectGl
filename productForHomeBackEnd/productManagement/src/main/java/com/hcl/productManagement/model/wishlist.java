package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDWishlist;
    @Column(name="IDUser")
    private int iDUser;
    @Column(name="IDPlace")
    private int iDPlace;

    public int getIDWishlist() {
        return this.IDWishlist;
    }

    public void setIDWishlist(int IDWishlist) {
        this.IDWishlist = IDWishlist;
    }

    public int getIDUser() {
        return this.iDUser;
    }

    public void setIDUser(int IDUser) {
        this.iDUser = IDUser;
    }

    public int getIDPlace() {
        return this.iDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.iDPlace = IDPlace;
    }

}
