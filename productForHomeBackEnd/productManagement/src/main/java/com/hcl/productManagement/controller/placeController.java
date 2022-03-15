package com.hcl.productManagement.controller;

import java.util.List;

import com.hcl.productManagement.model.PlaceEntity;
import com.hcl.productManagement.service.placeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/place/")
public class placeController {
  
    @Autowired
    placeService placeService;

    @GetMapping("getAllPlace")
    public List<PlaceEntity> getallplace() {
        
        return placeService.getAllPlace();
    }
    @GetMapping("place/{id}")
    public List<PlaceEntity> productDetail(@PathVariable("id") Integer  id) {
        
        return placeService.getPlaceDetail(id);
    }

    @GetMapping("place/category/{id}")
    public List<PlaceEntity> productByCategory(@PathVariable("id") Integer  id) {
        
        return placeService.getPlaceByCategory(id);
    }
    

}
