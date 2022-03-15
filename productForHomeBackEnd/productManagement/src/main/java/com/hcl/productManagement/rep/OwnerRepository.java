package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.productManagement.model.OwnerEntity;

public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer >{

}
