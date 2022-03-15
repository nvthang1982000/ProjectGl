package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface userRep extends JpaRepository<user, Integer>  {
    public user findByUsernameAndPassword(String user, String pass);
    public user findByUsername( String username);
}
