package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.productManagement.model.RentEntity;

@Repository
public interface RentRepository extends JpaRepository<RentEntity, Integer >{

}
