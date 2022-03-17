package com.hcl.productManagement.service;

import java.util.*;

import com.hcl.productManagement.model.PlaceEntity;
import com.hcl.productManagement.rep.PlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.nio.file.*;
@Service
public class systemService {
    @Autowired
    PlaceRepository rep;

    // @Autowired
    // wishlistRep wishrep;
    systemService() {

        this.rootLocation = Paths.get("src\\main\\resources\\upload");

    }

    private final Path rootLocation;
    // public List<PlaceEntity> SearchPlace(String key)
    // {
    //     //TODO-get search réuit
    //     List<PlaceEntity> products =new ArrayList<PlaceEntity>();
    //     //TO-get product detail
    //    for (String[] a : rep.search(key)) {
    //     PlaceEntity p=new PlaceEntity();
    //        p.setIdPlace(Integer.parseInt(a[0]));
    //        p.setAddress(a[1]);
    //        p.setCategory(Integer.parseInt(a[2]));
    //        p.setDescription(a[3]);
    //        p.setIdOwner(Integer.parseInt(a[4]));
    //        p.setNamePlace(a[5]);
    //        p.setPrice(Integer.parseInt(a[4]));
    //        products.add(p);
    //    } 
    //     return products;
    // }

    // public void addWishList(String productId,int idUser) {
    //     wishlist wl=new wishlist();
    //     wl.setIDPlace(Integer.parseInt(productId));
    //     wl.setIDUser(idUser);
    //     wishrep.save(wl);
    //     //TODO-add to wish list

    // }


    
    public String uploadFile(MultipartFile file,String filename) {
        try {
            if (file.isEmpty()) {
                System.out.println("File is null");
            }
            
            try (InputStream inputStream = file.getInputStream()) {
               
                Files.copy(file.getInputStream(), this.rootLocation.resolve(filename),
                StandardCopyOption.REPLACE_EXISTING); 
                System.out.println("ok");
                        return "ok";
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error");
        }
        return null;
    }

}
