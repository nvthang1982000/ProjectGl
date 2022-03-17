package com.hcl.admin.admin_management.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PlaceFeature")
public class PlaceFeatureEntity {
	@Id
	@GeneratedValue
	@Column(name = "IdPlaceFeature")
	private int  idPlaceFeature;

	@Column(name = "idPlace")
    private int idPlace;

	@Column(name = "idFeature")
	private int idFeature;

	public PlaceFeatureEntity() {
		super();
	}

	public PlaceFeatureEntity(int  idPlaceFeaturee, int idPlacee, int idFeaturee) {
		super();
		idPlaceFeature = idPlaceFeaturee;
		idPlace = idPlacee;
		idFeature = idFeaturee;
	}

	public int  getIdPlaceFeature() {
		return idPlaceFeature;
	}

	public void setIdPlaceFeature(int  idPlaceFeaturee) {
		idPlaceFeature = idPlaceFeaturee;
	}

	public int getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int idPlacee) {
		idPlace = idPlacee;
	}

	public int getIdFeature() {
		return idFeature;
	}

	public void setIdFeature(int idFeaturee) {
		idFeature = idFeaturee;
	}
	
	
}
