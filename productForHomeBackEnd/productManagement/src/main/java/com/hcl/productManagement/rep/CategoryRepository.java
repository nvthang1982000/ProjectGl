package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.productManagement.model.CategoryEntity;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer >{

}
