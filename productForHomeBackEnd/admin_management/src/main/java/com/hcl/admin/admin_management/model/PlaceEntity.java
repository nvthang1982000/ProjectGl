package com.hcl.admin.admin_management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Place")
public class PlaceEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IdPlace", length = 10, nullable = false)
	private int  idPlace;
	
	@Column(name = "NamePlace", length = 50, nullable = false)
	private String namePlace;
	
	@Column(name = "IdCat", length = 50, nullable = false)
    private int category;

	@Column(name = "IdOwner", length = 50, nullable = false)
    private int idOwner;
	
	@Column(name = "Address", length = 50, nullable = false)
	private String address;
	
	@Column(name = "Price", length = 50, nullable = false)
	private double price;

	@Column(name = "Description", length = Integer.MAX_VALUE, nullable = false)
	private String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String Description) {
		this.description = Description;
	}

	public PlaceEntity() {
		super();
	}

	public PlaceEntity(int  idplace, String nameplace, int categoryy, String addresss, double pricee, String descriptionn, int idOwnerr ) {
		super();
		idPlace = idplace;
		namePlace = nameplace;
		category = categoryy;
		address = addresss;
		price = pricee;
		description = descriptionn;
		idOwner = idOwnerr;
	}

	

	public int getIdOwner() {
		return this.idOwner;
	}

	public void setIdOwner(int idOwnerr) {
		this.idOwner = idOwnerr;
	}

	public int  getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int  idPlacee) {
		idPlace = idPlacee;
	}

	public String getNamePlace() {
		return  namePlace;
	}

	public void setNamePlace(String namePlacee) {
		namePlace = namePlacee;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int categoryy) {
		category = categoryy;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String addresss) {
		address = addresss;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pricee) {
		price = pricee;
	}
	
	
}
