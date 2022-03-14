package com.hcl.productManagement.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class placefetures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDPlacefetures;
    private int IDPlace;
    private int IDFeatures;

    public int getIDPlacefetures() {
        return this.IDPlacefetures;
    }

    public void setIDPlacefetures(int IDPlacefetures) {
        this.IDPlacefetures = IDPlacefetures;
    }

    public int getIDPlace() {
        return this.IDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.IDPlace = IDPlace;
    }

    public int getIDFeatures() {
        return this.IDFeatures;
    }

    public void setIDFeatures(int IDFeatures) {
        this.IDFeatures = IDFeatures;
    }

   
}
