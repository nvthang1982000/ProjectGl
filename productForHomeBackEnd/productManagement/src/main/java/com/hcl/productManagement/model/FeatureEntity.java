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
	private int  idFeature;
	
	@Column(name = "NameFeature", length = 50, nullable = false)
	private String nameFeature;

	public FeatureEntity() {
		super();
	}

	public FeatureEntity(int  idfeature, String namefeature) {
		super();
		idFeature = idfeature;
		nameFeature = namefeature;
	}

	public int  getIdFeature() {
		return idFeature;
	}

	public void setIdFeature(int idfeature) {
		idFeature = idfeature;
	}

	public String getNameFeature() {
		return nameFeature;
	}

	public void setNameFeature(String namefeature) {
		nameFeature = namefeature;
	}
	
	
}
