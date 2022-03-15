package com.hcl.productManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class CategoryEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IdCat")
	private int  IdCat;
	
	@Column(name = "NameCat", length = 20, nullable = false)
	private String NameCat;

	
	public CategoryEntity() {
		super();
	}


	public CategoryEntity(int  idCat, String nameCat) {
		super();
		IdCat = idCat;
		NameCat = nameCat;
	}


	public int  getIdCat() {
		return IdCat;
	}


	public void setIdCat(int  idCat) {
		IdCat = idCat;
	}


	public String getNameCat() {
		return NameCat;
	}


	public void setNameCat(String nameCat) {
		NameCat = nameCat;
	}
	
	
	
	
}
