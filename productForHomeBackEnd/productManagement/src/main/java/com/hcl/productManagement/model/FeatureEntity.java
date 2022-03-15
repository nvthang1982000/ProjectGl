package com.hcl.productManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Feature")
public class FeatureEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IdFeature")
	private int  IdFeature;
	
	@Column(name = "NameFeature", length = 50, nullable = false)
	private String NameFeature;

	public FeatureEntity() {
		super();
	}

	public FeatureEntity(int  idFeature, String nameFeature) {
		super();
		IdFeature = idFeature;
		NameFeature = nameFeature;
	}

	public int  getIdFeature() {
		return IdFeature;
	}

	public void setIdFeature(int idFeature) {
		IdFeature = idFeature;
	}

	public String getNameFeature() {
		return NameFeature;
	}

	public void setNameFeature(String nameFeature) {
		NameFeature = nameFeature;
	}
	
	
}
