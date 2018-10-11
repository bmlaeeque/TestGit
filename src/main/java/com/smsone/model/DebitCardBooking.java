package com.smsone.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class DebitCardBooking implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,unique = true)
	private Long dcId;
	@Column(nullable=false,length=20)
	private String debitName;
	@Column(nullable=false,length=20)
	private String debitcardNumber; 
	@Column(nullable=false,length=30)
	private String exmonth1;
	@Column(nullable=false,length=12,unique = true)
	private Long exyear1;
	@Column(nullable=false,length=10)
	private Long debitcardCVC;
	public Long getDcId() {
		return dcId;
	}
	public void setDcId(Long dcId) {
		this.dcId = dcId;
	}
	public String getDebitName() {
		return debitName;
	}
	public void setDebitName(String debitName) {
		this.debitName = debitName;
	}
	public String getDebitcardNumber() {
		return debitcardNumber;
	}
	public void setDebitcardNumber(String debitcardNumber) {
		this.debitcardNumber = debitcardNumber;
	}
	public String getExmonth1() {
		return exmonth1;
	}
	public void setExmonth1(String exmonth1) {
		this.exmonth1 = exmonth1;
	}
	public Long getExyear1() {
		return exyear1;
	}
	public void setExyear1(Long exyear1) {
		this.exyear1 = exyear1;
	}
	public Long getDebitcardCVC() {
		return debitcardCVC;
	}
	public void setDebitcardCVC(Long debitcardCVC) {
		this.debitcardCVC = debitcardCVC;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dcId == null) ? 0 : dcId.hashCode());
		result = prime * result + ((debitName == null) ? 0 : debitName.hashCode());
		result = prime * result + ((debitcardCVC == null) ? 0 : debitcardCVC.hashCode());
		result = prime * result + ((debitcardNumber == null) ? 0 : debitcardNumber.hashCode());
		result = prime * result + ((exmonth1 == null) ? 0 : exmonth1.hashCode());
		result = prime * result + ((exyear1 == null) ? 0 : exyear1.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebitCardBooking other = (DebitCardBooking) obj;
		if (dcId == null) {
			if (other.dcId != null)
				return false;
		} else if (!dcId.equals(other.dcId))
			return false;
		if (debitName == null) {
			if (other.debitName != null)
				return false;
		} else if (!debitName.equals(other.debitName))
			return false;
		if (debitcardCVC == null) {
			if (other.debitcardCVC != null)
				return false;
		} else if (!debitcardCVC.equals(other.debitcardCVC))
			return false;
		if (debitcardNumber == null) {
			if (other.debitcardNumber != null)
				return false;
		} else if (!debitcardNumber.equals(other.debitcardNumber))
			return false;
		if (exmonth1 == null) {
			if (other.exmonth1 != null)
				return false;
		} else if (!exmonth1.equals(other.exmonth1))
			return false;
		if (exyear1 == null) {
			if (other.exyear1 != null)
				return false;
		} else if (!exyear1.equals(other.exyear1))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DebitCardBooking [dcId=" + dcId + ", debitName=" + debitName + ", debitcardNumber=" + debitcardNumber
				+ ", exmonth1=" + exmonth1 + ", exyear1=" + exyear1 + ", debitcardCVC=" + debitcardCVC + "]";
	}
	public DebitCardBooking() {
		super();
		this.dcId = dcId;
		this.debitName = debitName;
		this.debitcardNumber = debitcardNumber;
		this.exmonth1 = exmonth1;
		this.exyear1 = exyear1;
		this.debitcardCVC = debitcardCVC;
	}
	
	

}
