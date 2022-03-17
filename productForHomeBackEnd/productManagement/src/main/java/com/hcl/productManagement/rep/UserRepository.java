package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.productManagement.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer >{
    public UserEntity findByUserNameAndPass(String user, String pass);
    public UserEntity findByUserName( String username);
}
