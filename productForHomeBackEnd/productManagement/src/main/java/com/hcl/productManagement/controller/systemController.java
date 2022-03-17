package com.hcl.productManagement.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hcl.productManagement.config.JwtTokenUtil;
import com.hcl.productManagement.model.*;
import com.hcl.productManagement.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
@RestController
@RequestMapping("/api/system/")
public class systemController {
    @Autowired
    systemService sys;
    @Autowired
	private JwtTokenUtil jwtTokenUtil;
    // @GetMapping("search")
    // public List<PlaceEntity> placeDetail(@RequestParam("key")  String key) {
    //     return sys.SearchPlace(key);
    // }

   
    @PostMapping("upload")
    public PlaceEntity create( @RequestPart("info") PlaceEntity place ,@RequestParam("file") MultipartFile f)
    {
        System.out.println(place.getPrice());
       System.out.println(f+"sdd");
       sys.uploadFile(f,"uuid".toString());
        return null;
    }
    
    

}
