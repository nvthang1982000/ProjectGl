package com.hcl.admin.admin_management.rep;

import org.springframework.stereotype.Repository;

import com.hcl.admin.admin_management.model.OwnerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ownerRep  extends JpaRepository<OwnerEntity, Integer>  {
    public OwnerEntity findByUserName( String username);
}
