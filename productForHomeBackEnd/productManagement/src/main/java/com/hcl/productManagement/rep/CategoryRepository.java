package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.productManagement.model.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer >{

}
