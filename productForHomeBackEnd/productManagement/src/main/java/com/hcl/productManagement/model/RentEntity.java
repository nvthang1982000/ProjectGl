package com.hcl.productManagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Rent")
public class RentEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "IdRent")
	private int  IdRent;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdOwner", nullable = false)
    private OwnerEntity IdOwner;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdUser", nullable = false)
    private UserEntity IdUser;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "StartDate", nullable = false)
    private Date StartDate;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FinishDate", nullable = false)
    private Date FinishDate;

	public RentEntity() {
		super();
	}

	public RentEntity(int  idRent, OwnerEntity idOwner, UserEntity idUser, Date startDate, Date finishDate) {
		super();
		IdRent = idRent;
		IdOwner = idOwner;
		IdUser = idUser;
		StartDate = startDate;
		FinishDate = finishDate;
	}

	public int  getIdRent() {
		return IdRent;
	}

	public void setIdRent(int  idRent) {
		IdRent = idRent;
	}

	public OwnerEntity getIdOwner() {
		return IdOwner;
	}

	public void setIdOwner(OwnerEntity idOwner) {
		IdOwner = idOwner;
	}

	public UserEntity getIdUser() {
		return IdUser;
	}

	public void setIdUser(UserEntity idUser) {
		IdUser = idUser;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getFinishDate() {
		return FinishDate;
	}

	public void setFinishDate(Date finishDate) {
		FinishDate = finishDate;
	}
	
	
}
