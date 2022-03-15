package com.hcl.productManagement.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PlaceFeature")
public class PlaceFeatureEntity {
	@Id
	@GeneratedValue
	@Column(name = "IdPlaceFeature")
	private int  IdPlaceFeature;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPlace", nullable = false)
    private PlaceEntity IdPlace;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdFeature", nullable = false)
	private FeatureEntity IdFeature;

	public PlaceFeatureEntity() {
		super();
	}

	public PlaceFeatureEntity(int  idPlaceFeature, PlaceEntity idPlace, FeatureEntity idFeature) {
		super();
		IdPlaceFeature = idPlaceFeature;
		IdPlace = idPlace;
		IdFeature = idFeature;
	}

	public int  getIdPlaceFeature() {
		return IdPlaceFeature;
	}

	public void setIdPlaceFeature(int  idPlaceFeature) {
		IdPlaceFeature = idPlaceFeature;
	}

	public PlaceEntity getIdPlace() {
		return IdPlace;
	}

	public void setIdPlace(PlaceEntity idPlace) {
		IdPlace = idPlace;
	}

	public FeatureEntity getIdFeature() {
		return IdFeature;
	}

	public void setIdFeature(FeatureEntity idFeature) {
		IdFeature = idFeature;
	}
	
	
}
