package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.placeRep;
import com.hcl.productManagement.model.place;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class placeService {
    @Autowired
    placeRep rep;

    public List<place> getAllPlace()
    {
        //TODO-get all product
            return null;
    }

    public List<place> getPlaceDetail(Integer id) {
        //TODO-get product detail

        return null;
    }

    public List<place> getPlaceByCategory(Integer id) {
        //TODO-get product by category

        return null;
    }
    
}
