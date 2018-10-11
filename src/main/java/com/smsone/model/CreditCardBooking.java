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

public class CreditCardBooking implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,unique = true)
	private  Long cdId_bookedBed;
	@Column(nullable=false,length=20)
	private String creditName;
	@Column(nullable=false,length=20)
	private String cardNumber; 
	@Column(nullable=false,length=30)
	private String exmonth;
	@Column(nullable=false,length=12,unique = true)
	private Long exyear;
	@Column(nullable=false,length=10)
	private Long cvcnumber;
	public  Long getCdId_bookedBed() {
		return cdId_bookedBed;
	}
	public void setCdId_bookedBed(Long cdId_bookedBed) {
		this.cdId_bookedBed = cdId_bookedBed;
	}
	public String getCreditName() {
		return creditName;
	}
	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExmonth() {
		return exmonth;
	}
	public void setExmonth(String exmonth) {
		this.exmonth = exmonth;
	}
	public Long getExyear() {
		return exyear;
	}
	public void setExyear(Long exyear) {
		this.exyear = exyear;
	}
	public Long getCvcnumber() {
		return cvcnumber;
	}
	public void setCvcnumber(Long cvcnumber) {
		this.cvcnumber = cvcnumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((cdId_bookedBed == null) ? 0 : cdId_bookedBed.hashCode());
		result = prime * result + ((creditName == null) ? 0 : creditName.hashCode());
		result = prime * result + ((cvcnumber == null) ? 0 : cvcnumber.hashCode());
		result = prime * result + ((exmonth == null) ? 0 : exmonth.hashCode());
		result = prime * result + ((exyear == null) ? 0 : exyear.hashCode());
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
		CreditCardBooking other = (CreditCardBooking) obj;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (cdId_bookedBed == null) {
			if (other.cdId_bookedBed != null)
				return false;
		} else if (!cdId_bookedBed.equals(other.cdId_bookedBed))
			return false;
		if (creditName == null) {
			if (other.creditName != null)
				return false;
		} else if (!creditName.equals(other.creditName))
			return false;
		if (cvcnumber == null) {
			if (other.cvcnumber != null)
				return false;
		} else if (!cvcnumber.equals(other.cvcnumber))
			return false;
		if (exmonth == null) {
			if (other.exmonth != null)
				return false;
		} else if (!exmonth.equals(other.exmonth))
			return false;
		if (exyear == null) {
			if (other.exyear != null)
				return false;
		} else if (!exyear.equals(other.exyear))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CreditCardBooking [cdId_bookedBed=" + cdId_bookedBed + ", creditName=" + creditName + ", cardNumber="
				+ cardNumber + ", exmonth=" + exmonth + ", exyear=" + exyear + ", cvcnumber=" + cvcnumber + "]";
	}
	public CreditCardBooking() {
		super();
		this.cdId_bookedBed = cdId_bookedBed;
		this.creditName = creditName;
		this.cardNumber = cardNumber;
		this.exmonth = exmonth;
		this.exyear = exyear;
		this.cvcnumber = cvcnumber;
	}
	
	
	

}
