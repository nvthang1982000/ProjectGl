

package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.categories;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface categoriesRep extends JpaRepository<categories, Integer>  {
    
}
