package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.productManagement.model.RentEntity;

public interface RentRepository extends JpaRepository<RentEntity, Integer >{

}
