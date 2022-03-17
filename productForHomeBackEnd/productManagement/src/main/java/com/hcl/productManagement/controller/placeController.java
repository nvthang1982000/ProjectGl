package com.hcl.productManagement.controller;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.hcl.productManagement.model.*;
import com.hcl.productManagement.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/place/")
public class placeController {
    
    @Autowired
    private EntityManager entityManager;
  
    @Autowired
    placeService placeService;

    @Autowired
    systemService sysService;

    @GetMapping("getAllPlace")
    public List<PlaceEntity> getallplace() {
        
        return placeService.getAllPlace();
    }
    @GetMapping("place/{id}")
    public PlaceEntity placeDetail(@PathVariable("id") Integer  id) {
        
        return placeService.getPlaceDetail(id);
    }

    @GetMapping("category/{id}")
    public List<PlaceEntity> placeByCategory(@PathVariable("id") Integer  id) {
        
        return placeService.getPlaceByCategory(id);
    }

    @GetMapping("search/{name}")

    public List<PlaceEntity> searchByNamePlace(@PathVariable("name") String name) {

        String sql = "Select new " + PlaceEntity.class.getName() //
          + "(p.idPlace, p.namePlace, p.category, p.address, p.price, p.description, p.idOwner) " + " from "//
          + PlaceEntity.class.getName() + " p ";

        if (name != null && name.length() > 0) {

            sql += " Where lower(p.namePlace) like :likeName ";

        }

        sql += " order by p.namePlace desc ";

        Query query = this.entityManager.createQuery(sql, PlaceEntity.class);


        if (name != null && name.length() > 0) {

            query.setParameter("likeName", "%" + name.toLowerCase() + "%");

        }
        List<PlaceEntity> arr = query.getResultList();

        if (arr.size() != 0) {

            return arr;

        } else {

            return null;

        }

    }

    @PostMapping("create")
    public PlaceEntity productCreate(@RequestPart("info") PlaceEntity place ,@RequestParam("file") MultipartFile[] file) {

        String uuid = UUID.randomUUID().toString();
        ArrayList<String> image=new ArrayList<String>();
        for(int i=0;i<file.length;i++)
        {
            String filename = uuid+"."+file[i].getOriginalFilename().substring(file[i].getOriginalFilename().lastIndexOf(".") + 1);
            sysService.uploadFile(file[i],"place/"+filename);
            image.add(filename);
        }
        
        place.setImage(String.join(",", image));
        placeService.create(place);
        return place;
    }

    @PostMapping("edit/{id}")
    public PlaceEntity edit( @RequestPart("info") PlaceEntity place,
    @PathVariable("id") Integer  id
    ,@RequestParam("file") MultipartFile f)
    {
        System.out.println(place);
        if(f==null)
        {
            System.out.println("file null");
        }
        place.setIdPlace(id);
        String uuid = UUID.randomUUID().toString();
        String filename = uuid+"."+f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf(".") + 1);
        place.setImage(filename);
        placeService.edit(place);
        sysService.uploadFile(f,"place/"+filename);
        return place;
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable("id") int id )
    {
        placeService.delete(id);
    }
    
    @GetMapping("feature/{id}")
    public List<PlaceEntity> getPlacebyFeature(@PathVariable("id") int id) {

        String sql = "SELECT e from " + PlaceFeatureEntity.class.getName() + " e where e.idFeature = :id";

        Query query = this.entityManager.createQuery(sql, PlaceFeatureEntity.class);

        query.setParameter("id", id);

        List<PlaceFeatureEntity> arr = query.getResultList();

        if (arr.size() != 0) {

            List<PlaceEntity> arr1 = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++) {

                String sql1 = "Select p from " + PlaceEntity.class.getName() + " p Where p.idPlace = :idP";

                Query query1 = this.entityManager.createQuery(sql1, PlaceEntity.class);

                query1.setParameter("idP", arr.get(i).getIdPlace());

                arr1.add((PlaceEntity) query1.getSingleResult());

            }

            return arr1;

        } else {

            return null;

        }

    }
    

}
