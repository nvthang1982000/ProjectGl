package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.hcl.productManagement.model.PlaceEntity;
@Repository
public interface PlaceRepository extends JpaRepository<PlaceEntity, Integer >{
    // List<PlaceEntity> queryProducts(String likeName);
    // List<String []> getPlaceDetail(@Param("param") int id);
    // List<String []> search(@Param("key") String key);
}
