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
@Table(name = "ImagePlace")
public class ImageEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IdImage")
	private int  IdImage;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPlace", nullable = false)
    private PlaceEntity IdPlace;
	
    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
    private String image;

	public ImageEntity() {
		super();
	}

	public ImageEntity(int  idImage, PlaceEntity idPlace, String image) {
		super();
		IdImage = idImage;
		IdPlace = idPlace;
		this.image = image;
	}

	public int  getIdImage() {
		return IdImage;
	}

	public void setIdImage(int  idImage) {
		IdImage = idImage;
	}

	public PlaceEntity getIdPlace() {
		return IdPlace;
	}

	public void setIdPlace(PlaceEntity idPlace) {
		IdPlace = idPlace;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
