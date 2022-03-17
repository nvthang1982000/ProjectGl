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
	private int  idRent;
	
	@Column(name = "idOwner")
    private int idOwner;
	
	@Column(name = "idUser")
    private int idUser;

	@Column(name = "idPlace")
    private int idPlace;

	public int getIdPlace() {
		return this.idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FinishDate", nullable = false)
    private Date finishDate;

	public RentEntity() {
		super();
	}

	public RentEntity(int  idRentt, int idOwnerr, int idUserr, Date startDatee, Date finishDatee, int idplace) {
		super();
		idRent = idRentt;
		idOwner = idOwnerr;
		idUser = idUserr;
		startDate = startDatee;
		finishDate = finishDatee;
		idPlace = idplace;
	}

	public int  getIdRent() {
		return idRent;
	}

	public void setIdRent(int  idRentt) {
		idRent = idRentt;
	}

	public int getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(int idOwnerr) {
		idOwner = idOwnerr;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUserr) {
		idUser = idUserr;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDatee) {
		startDate = startDatee;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDatee) {
		finishDate = finishDatee;
	}
	
	
}
