package com.hcl.productManagement.service;


import com.hcl.productManagement.model.*;
import com.hcl.productManagement.rep.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class categoryService {
    @Autowired
    CategoryRepository rep;

    public List<CategoryEntity> getAllcategory()
    {
      return rep.findAll();
    }

  
    
}
