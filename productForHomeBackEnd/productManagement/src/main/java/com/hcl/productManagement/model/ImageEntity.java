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
	private int  idImage;
	
    @Column(name = "IdPlace")
    private int idPlace;
	
    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
    private String image;

	public ImageEntity() {
		super();
	}

	public ImageEntity(int  idimage, int idplace, String imagee) {
		super();
		idImage = idimage;
		idPlace = idplace;
		this.image = imagee;
	}

	public int  getIdImage() {
		return idImage;
	}

	public void setIdImage(int  idimage) {
		idImage = idimage;
	}

	public int getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int idplace) {
		idPlace = idplace;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
