package com.hcl.productManagement.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.productManagement.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer >{
    public UserEntity findByUserNameAndPassword(String user, String pass);
    public UserEntity findByUserName( String username);
}
