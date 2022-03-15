package com.hcl.productManagement.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class placefetures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDPlacefetures;
    @Column(name="IDPlace")
    private int iDPlace;
    @Column(name="IDFeatures")
    private int iDFeatures;

    public int getIDPlacefetures() {
        return this.IDPlacefetures;
    }

    public void setIDPlacefetures(int IDPlacefetures) {
        this.IDPlacefetures = IDPlacefetures;
    }

    public int getIDPlace() {
        return this.iDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.iDPlace = IDPlace;
    }

    public int getIDFeatures() {
        return this.iDFeatures;
    }

    public void setIDFeatures(int IDFeatures) {
        this.iDFeatures = IDFeatures;
    }

   
}
