

package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.place;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface placeRep extends JpaRepository<place, Integer>  {
    
}
