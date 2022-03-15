
package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.UserRepository;
import com.hcl.productManagement.model.UserEntity;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class userService implements UserDetailsService{
    @Autowired
    UserRepository rep;
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        UserEntity u=rep.findById(Integer.parseInt(id)).get();
        if (u == null) {
             throw new UsernameNotFoundException("User not found with id: " + id);
        }
    
       return new org.springframework.security.core.userdetails.User(u.getUserName(), u.getPass(),
       new ArrayList<>());
    }

    public boolean checkUsername(String email)
    {
      return rep.findByUserName(email) == null ;
    }

    public UserEntity login(UserEntity user) {

        return rep.findByUserName(user.getUserName());
    }

    public UserEntity create(UserEntity user) {
        //TODO-create use
        return rep.save(user);
    }

}