package com.hcl.admin.admin_management.service;


import java.util.*;

import com.hcl.admin.admin_management.model.OwnerEntity;
import com.hcl.admin.admin_management.rep.ownerRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ownerService  implements UserDetailsService {
    @Autowired
    ownerRep rep;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        OwnerEntity u=rep.findByUserName(username);
        if (u == null) {
             throw new UsernameNotFoundException("User not found with username: " + username);
        }
    
       return new org.springframework.security.core.userdetails.User(u.getUserName(), u.getPass(),
       new ArrayList<>());
    }
    public OwnerEntity login(OwnerEntity user) {
        return rep.findByUserName(user.getUserName());
    }
    public OwnerEntity create(OwnerEntity user) {
        //TODO-create use
        return rep.save(user);
    }
    public boolean checkUsername(String un)
    {
      return rep.findByUserName(un) == null ;
    }
    public List<OwnerEntity> getAll() {

        return rep.findAll();
    }
}

