// package com.hcl.productManagement.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import org.springframework.web.multipart.MultipartFile;

// import java.io.InputStream;
// import java.nio.file.*;
// @Service
// public class systemService {
//     @Autowired
//     PlaceRepository rep;

//     @Autowired
//     wishlistRep wishrep;
//     systemService() {

//         this.rootLocation = Paths.get("src\\main\\resources\\upload");

//     }

//     private final Path rootLocation;
//     public List<place> SearchPlace(String key)
//     {
//         //TODO-get search réuit
//             return null;
//     }

//     public void addWishList(String productId,int idUser) {
//         wishlist wl=new wishlist();
//         wl.setIDPlace(Integer.parseInt(productId));
//         wl.setIDUser(idUser);
//         wishrep.save(wl);
//         //TODO-add to wish list

//     }


    
//     public String uploadFile(MultipartFile file,String filename) {
//         try {
//             if (file.isEmpty()) {
//                 System.out.println("File is null");
//             }
            
//             try (InputStream inputStream = file.getInputStream()) {
               
//                 Files.copy(file.getInputStream(), this.rootLocation.resolve(filename),
//                 StandardCopyOption.REPLACE_EXISTING); 
//                 System.out.println("ok");
//                         return "ok";
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//             System.out.println("error");
//         }
//         return null;
//     }

// }
