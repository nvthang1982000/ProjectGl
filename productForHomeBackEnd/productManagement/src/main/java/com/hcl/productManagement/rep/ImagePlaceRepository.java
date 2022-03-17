package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.productManagement.model.ImageEntity;


@Repository
public interface ImagePlaceRepository extends JpaRepository<ImageEntity, Integer >{

}
