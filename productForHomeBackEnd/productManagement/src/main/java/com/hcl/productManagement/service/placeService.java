package com.hcl.productManagement.service;


import java.util.List;

import com.hcl.productManagement.model.PlaceEntity;
import com.hcl.productManagement.rep.PlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class placeService {
    @Autowired
    PlaceRepository rep;

    public List<PlaceEntity> getAllPlace()
    {
        //TODO-get all product
            return null;
    }

    public List<PlaceEntity> getPlaceDetail(Integer id) {
        //TODO-get product detail

        return null;
    }

    public List<PlaceEntity> getPlaceByCategory(Integer id) {
        //TODO-get product by category

        return null;
    }
    
}
