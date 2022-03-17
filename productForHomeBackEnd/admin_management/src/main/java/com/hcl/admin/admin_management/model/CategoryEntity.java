package com.hcl.admin.admin_management.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class CategoryEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IdCat")
	private int  idCat;
	
	@Column(name = "NameCat", length = 20, nullable = false)
	private String nameCat;

	

	public CategoryEntity() {
		super();
	}


	public CategoryEntity(int  idcat, String namecat) {
		super();
		idCat = idcat;
		nameCat = namecat;
	}


	public int  getIdCat() {
		return idCat;
	}


	public void setIdCat(int  idcat) {
		idCat = idcat;
	}


	public String getNameCat() {
		return nameCat;
	}


	public void setNameCat(String namecat) {
		nameCat = namecat;
	}
	
}
