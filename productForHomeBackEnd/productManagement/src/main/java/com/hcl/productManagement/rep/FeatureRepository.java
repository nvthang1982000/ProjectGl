package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.productManagement.model.FeatureEntity;


@Repository
public interface FeatureRepository extends JpaRepository<FeatureEntity, Integer >{

}
