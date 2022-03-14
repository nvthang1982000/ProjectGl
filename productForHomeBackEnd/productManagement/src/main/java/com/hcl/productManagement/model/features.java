package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class features {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDFeatures;
    private String Name;

    public int getIDFeatures() {
        return this.IDFeatures;
    }

    public void setIDFeatures(int IDFeatures) {
        this.IDFeatures = IDFeatures;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    

}

