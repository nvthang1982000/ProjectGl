package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDImage;
    @Column(name="IDPlace")
    private int iDPlace;
    @Column(name="Name")
    private String name;

    public int getIDImage() {
        return this.IDImage;
    }

    public void setIDImage(int IDImage) {
        this.IDImage = IDImage;
    }

    public int getIDPlace() {
        return this.iDPlace;
    }

    public void setIDPlace(int IDPlace) {
        this.iDPlace = IDPlace;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    
}
