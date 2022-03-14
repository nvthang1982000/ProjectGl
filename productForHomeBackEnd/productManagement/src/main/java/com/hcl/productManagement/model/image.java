package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDImage;
    private int IDPlace;
    private String Name;

    public int getIDImage() {
        return this.IDImage;
    }

    public void setIDImage(int IDImage) {
        this.IDImage = IDImage;
    }

    public int getIDPlace() {
        return this.IDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.IDPlace = IDPlace;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
}
