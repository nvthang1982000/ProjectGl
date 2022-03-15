// package com.hcl.productManagement.controller;

// import java.util.List;

// import com.hcl.productManagement.model.place;
// import com.hcl.productManagement.service.placeService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/place/")
// public class placeController {
  
//     @Autowired
//     placeService placeService;

//     @GetMapping("getAllPlace")
//     public List<place> getallp() {
        
//         return placeService.getAllPlace();
//     }
//     @GetMapping("place/{id}")
//     public List<place> productDetail(@PathVariable("id") Integer  id) {
        
//         return placeService.getPlaceDetail(id);
//     }

//     @GetMapping("place/category/{id}")
//     public List<place> productByCategory(@PathVariable("id") Integer  id) {
        
//         return placeService.getPlaceByCategory(id);
//     }
    

// }
