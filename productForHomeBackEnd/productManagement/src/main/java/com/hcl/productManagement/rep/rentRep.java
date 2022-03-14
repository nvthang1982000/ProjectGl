package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.rent;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface rentRep extends JpaRepository<rent, Integer>  {
    
}