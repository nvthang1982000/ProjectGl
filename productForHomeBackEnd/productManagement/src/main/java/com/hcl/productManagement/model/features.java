package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class features {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDFeatures;
    @Column(name="Name")
    private String name;

    public int getIDFeatures() {
        return this.IDFeatures;
    }

    public void setIDFeatures(int IDFeatures) {
        this.IDFeatures = IDFeatures;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    

}

