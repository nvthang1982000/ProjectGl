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
@Table(name = "PlaceEntity")
public class PlaceEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IdPlace", length = 10, nullable = false)
	private int  IdPlace;
	
	@Column(name = "NamePlace", length = 50, nullable = false)
	private String NamePlace;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCat", nullable = false)
    private CategoryEntity Category;
	
	@Column(name = "Address", length = 50, nullable = false)
	private String Address;
	
	@Column(name = "Price", length = 50, nullable = false)
	private double Price;

	public PlaceEntity() {
		super();
	}

	public PlaceEntity(int  idPlace, String namePlace, CategoryEntity category, String address, double price) {
		super();
		IdPlace = idPlace;
		NamePlace = namePlace;
		Category = category;
		Address = address;
		Price = price;
	}

	public int  getIdPlace() {
		return IdPlace;
	}

	public void setIdPlace(int  idPlace) {
		IdPlace = idPlace;
	}

	public String getNamePlace() {
		return NamePlace;
	}

	public void setNamePlace(String namePlace) {
		NamePlace = namePlace;
	}

	public CategoryEntity getCategory() {
		return Category;
	}

	public void setCategory(CategoryEntity category) {
		Category = category;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	
	
}
