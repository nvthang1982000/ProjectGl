package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.productManagement.model.OwnerEntity;


@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer >{

}
