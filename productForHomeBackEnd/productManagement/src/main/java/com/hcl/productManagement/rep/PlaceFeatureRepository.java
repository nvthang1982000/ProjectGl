package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.productManagement.model.PlaceFeatureEntity;

@Repository
public interface PlaceFeatureRepository extends JpaRepository<PlaceFeatureEntity, Integer >{
}
