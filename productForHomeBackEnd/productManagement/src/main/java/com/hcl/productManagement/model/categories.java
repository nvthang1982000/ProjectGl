package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDCategories;
    @Column(name="Name")
    private String name;

    public int getIDCategories() {
        return this.IDCategories;
    }

    public void setIDCategories(int IDCategories) {
        this.IDCategories = IDCategories;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    
}
