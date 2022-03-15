package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.productManagement.model.ImageEntity;

public interface ImagePlaceRepository extends JpaRepository<ImageEntity, Integer >{

}
