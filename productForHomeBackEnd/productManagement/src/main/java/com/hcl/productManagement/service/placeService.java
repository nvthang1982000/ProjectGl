package com.hcl.productManagement.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import com.hcl.productManagement.model.ImageEntity;
import com.hcl.productManagement.model.PlaceEntity;
import com.hcl.productManagement.rep.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

@Service
public class placeService {
    @Autowired
    PlaceRepository rep;
    @Autowired
    ImagePlaceRepository imageRep;

    public List<PlaceEntity> getAllPlace()
    {
        //TODO-get all product
            return rep.findAll();
    }

    public PlaceEntity getPlaceDetail(int id) {
        //TODO-get product detail

        return rep.findById(id).get();
    }

    public List<PlaceEntity> getPlaceByCategory(Integer id) {
        //TODO-get product by category

        return null;
    }

    public PlaceEntity getDetail(int id)
    {
        return rep.findById(id).get();
    }

    public void create(PlaceEntity p)
    {
        p=rep.save(p);
        String [] images=p.getImage().split(",");
        for(int i=0;i<5;i++)
        {
            ImageEntity ima = new ImageEntity();
            ima.setIdPlace(p.getIdPlace());
            ima.setImage(images[i]);
            imageRep.save(ima);
        }
    }
    public PlaceEntity edit(PlaceEntity place) {
        Optional<PlaceEntity> existing=rep.findById(place.getIdPlace());
        System.out.println(place.getIdPlace());
		if(existing.isPresent())
		{
            System.out.println("edit");
			PlaceEntity old=existing.get();
			old.setNamePlace(place.getNamePlace());
			old.setCategory(place.getCategory());
			old.setAddress(place.getAddress());
			old.setPrice(place.getPrice());
            old.setIdOwner(place.getIdOwner());
            rep.save(old);
			return old;

		}
		else
			return null;
    }

    public void delete(int id) {
        PlaceEntity a=rep.findById(id).get();
		rep.delete(a);
    }
}
