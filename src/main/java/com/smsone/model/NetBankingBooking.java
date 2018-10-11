package com.smsone.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class NetBankingBooking implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long nbId;

	private String andhraBank;
	private String allahabadBank; 
	private String bankofBaroda;
	private String canaraBank;
	private String idbiBank;
	private String iciciBank;
	private String indianOverseasBank;
	private String punjabNationalBank;
	private String southIndianBank;
	private String sbi;
	
	
	private String cityUnionBank;
	private String hdfcBank; 
	private String indusIndBank;
	private String syndicateBank;
	private String deutscheBank;
	private String corporationBank;
	private String ucoBank;
	private String indianBank;
	private String fedralBank;
	private String ingVysya;
	
	public Long getNbId() {
		return nbId;
	}
	public void setNbId(Long nbId) {
		this.nbId = nbId;
	}
	public String getAndhraBank() {
		return andhraBank;
	}
	public void setAndhraBank(String andhraBank) {
		this.andhraBank = andhraBank;
	}
	public String getAllahabadBank() {
		return allahabadBank;
	}
	public void setAllahabadBank(String allahabadBank) {
		this.allahabadBank = allahabadBank;
	}
	public String getBankofBaroda() {
		return bankofBaroda;
	}
	public void setBankofBaroda(String bankofBaroda) {
		this.bankofBaroda = bankofBaroda;
	}
	public String getCanaraBank() {
		return canaraBank;
	}
	public void setCanaraBank(String canaraBank) {
		this.canaraBank = canaraBank;
	}
	public String getIdbiBank() {
		return idbiBank;
	}
	public void setIdbiBank(String idbiBank) {
		this.idbiBank = idbiBank;
	}
	public String getIciciBank() {
		return iciciBank;
	}
	public void setIciciBank(String iciciBank) {
		this.iciciBank = iciciBank;
	}
	public String getIndianOverseasBank() {
		return indianOverseasBank;
	}
	public void setIndianOverseasBank(String indianOverseasBank) {
		this.indianOverseasBank = indianOverseasBank;
	}
	public String getPunjabNationalBank() {
		return punjabNationalBank;
	}
	public void setPunjabNationalBank(String punjabNationalBank) {
		this.punjabNationalBank = punjabNationalBank;
	}
	public String getSouthIndianBank() {
		return southIndianBank;
	}
	public void setSouthIndianBank(String southIndianBank) {
		this.southIndianBank = southIndianBank;
	}
	public String getSbi() {
		return sbi;
	}
	public void setSbi(String sbi) {
		this.sbi = sbi;
	}
	public String getCityUnionBank() {
		return cityUnionBank;
	}
	public void setCityUnionBank(String cityUnionBank) {
		this.cityUnionBank = cityUnionBank;
	}
	public String getHdfcBank() {
		return hdfcBank;
	}
	public void setHdfcBank(String hdfcBank) {
		this.hdfcBank = hdfcBank;
	}
	public String getIndusIndBank() {
		return indusIndBank;
	}
	public void setIndusIndBank(String indusIndBank) {
		this.indusIndBank = indusIndBank;
	}
	public String getSyndicateBank() {
		return syndicateBank;
	}
	public void setSyndicateBank(String syndicateBank) {
		this.syndicateBank = syndicateBank;
	}
	public String getDeutscheBank() {
		return deutscheBank;
	}
	public void setDeutscheBank(String deutscheBank) {
		this.deutscheBank = deutscheBank;
	}
	public String getCorporationBank() {
		return corporationBank;
	}
	public void setCorporationBank(String corporationBank) {
		this.corporationBank = corporationBank;
	}
	public String getUcoBank() {
		return ucoBank;
	}
	public void setUcoBank(String ucoBank) {
		this.ucoBank = ucoBank;
	}
	public String getIndianBank() {
		return indianBank;
	}
	public void setIndianBank(String indianBank) {
		this.indianBank = indianBank;
	}
	public String getFedralBank() {
		return fedralBank;
	}
	public void setFedralBank(String fedralBank) {
		this.fedralBank = fedralBank;
	}
	public String getIngVysya() {
		return ingVysya;
	}
	public void setIngVysya(String ingVysya) {
		this.ingVysya = ingVysya;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allahabadBank == null) ? 0 : allahabadBank.hashCode());
		result = prime * result + ((andhraBank == null) ? 0 : andhraBank.hashCode());
		result = prime * result + ((bankofBaroda == null) ? 0 : bankofBaroda.hashCode());
		result = prime * result + ((canaraBank == null) ? 0 : canaraBank.hashCode());
		result = prime * result + ((cityUnionBank == null) ? 0 : cityUnionBank.hashCode());
		result = prime * result + ((corporationBank == null) ? 0 : corporationBank.hashCode());
		result = prime * result + ((deutscheBank == null) ? 0 : deutscheBank.hashCode());
		result = prime * result + ((fedralBank == null) ? 0 : fedralBank.hashCode());
		result = prime * result + ((hdfcBank == null) ? 0 : hdfcBank.hashCode());
		result = prime * result + ((iciciBank == null) ? 0 : iciciBank.hashCode());
		result = prime * result + ((idbiBank == null) ? 0 : idbiBank.hashCode());
		result = prime * result + ((indianBank == null) ? 0 : indianBank.hashCode());
		result = prime * result + ((indianOverseasBank == null) ? 0 : indianOverseasBank.hashCode());
		result = prime * result + ((indusIndBank == null) ? 0 : indusIndBank.hashCode());
		result = prime * result + ((ingVysya == null) ? 0 : ingVysya.hashCode());
		result = prime * result + ((nbId == null) ? 0 : nbId.hashCode());
		result = prime * result + ((punjabNationalBank == null) ? 0 : punjabNationalBank.hashCode());
		result = prime * result + ((sbi == null) ? 0 : sbi.hashCode());
		result = prime * result + ((southIndianBank == null) ? 0 : southIndianBank.hashCode());
		result = prime * result + ((syndicateBank == null) ? 0 : syndicateBank.hashCode());
		result = prime * result + ((ucoBank == null) ? 0 : ucoBank.hashCode());
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
		NetBankingBooking other = (NetBankingBooking) obj;
		if (allahabadBank == null) {
			if (other.allahabadBank != null)
				return false;
		} else if (!allahabadBank.equals(other.allahabadBank))
			return false;
		if (andhraBank == null) {
			if (other.andhraBank != null)
				return false;
		} else if (!andhraBank.equals(other.andhraBank))
			return false;
		if (bankofBaroda == null) {
			if (other.bankofBaroda != null)
				return false;
		} else if (!bankofBaroda.equals(other.bankofBaroda))
			return false;
		if (canaraBank == null) {
			if (other.canaraBank != null)
				return false;
		} else if (!canaraBank.equals(other.canaraBank))
			return false;
		if (cityUnionBank == null) {
			if (other.cityUnionBank != null)
				return false;
		} else if (!cityUnionBank.equals(other.cityUnionBank))
			return false;
		if (corporationBank == null) {
			if (other.corporationBank != null)
				return false;
		} else if (!corporationBank.equals(other.corporationBank))
			return false;
		if (deutscheBank == null) {
			if (other.deutscheBank != null)
				return false;
		} else if (!deutscheBank.equals(other.deutscheBank))
			return false;
		if (fedralBank == null) {
			if (other.fedralBank != null)
				return false;
		} else if (!fedralBank.equals(other.fedralBank))
			return false;
		if (hdfcBank == null) {
			if (other.hdfcBank != null)
				return false;
		} else if (!hdfcBank.equals(other.hdfcBank))
			return false;
		if (iciciBank == null) {
			if (other.iciciBank != null)
				return false;
		} else if (!iciciBank.equals(other.iciciBank))
			return false;
		if (idbiBank == null) {
			if (other.idbiBank != null)
				return false;
		} else if (!idbiBank.equals(other.idbiBank))
			return false;
		if (indianBank == null) {
			if (other.indianBank != null)
				return false;
		} else if (!indianBank.equals(other.indianBank))
			return false;
		if (indianOverseasBank == null) {
			if (other.indianOverseasBank != null)
				return false;
		} else if (!indianOverseasBank.equals(other.indianOverseasBank))
			return false;
		if (indusIndBank == null) {
			if (other.indusIndBank != null)
				return false;
		} else if (!indusIndBank.equals(other.indusIndBank))
			return false;
		if (ingVysya == null) {
			if (other.ingVysya != null)
				return false;
		} else if (!ingVysya.equals(other.ingVysya))
			return false;
		if (nbId == null) {
			if (other.nbId != null)
				return false;
		} else if (!nbId.equals(other.nbId))
			return false;
		if (punjabNationalBank == null) {
			if (other.punjabNationalBank != null)
				return false;
		} else if (!punjabNationalBank.equals(other.punjabNationalBank))
			return false;
		if (sbi == null) {
			if (other.sbi != null)
				return false;
		} else if (!sbi.equals(other.sbi))
			return false;
		if (southIndianBank == null) {
			if (other.southIndianBank != null)
				return false;
		} else if (!southIndianBank.equals(other.southIndianBank))
			return false;
		if (syndicateBank == null) {
			if (other.syndicateBank != null)
				return false;
		} else if (!syndicateBank.equals(other.syndicateBank))
			return false;
		if (ucoBank == null) {
			if (other.ucoBank != null)
				return false;
		} else if (!ucoBank.equals(other.ucoBank))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "NetBankingBooking [nbId=" + nbId + ", andhraBank=" + andhraBank + ", allahabadBank=" + allahabadBank
				+ ", bankofBaroda=" + bankofBaroda + ", canaraBank=" + canaraBank + ", idbiBank=" + idbiBank
				+ ", iciciBank=" + iciciBank + ", indianOverseasBank=" + indianOverseasBank + ", punjabNationalBank="
				+ punjabNationalBank + ", southIndianBank=" + southIndianBank + ", sbi=" + sbi + ", cityUnionBank="
				+ cityUnionBank + ", hdfcBank=" + hdfcBank + ", indusIndBank=" + indusIndBank + ", syndicateBank="
				+ syndicateBank + ", deutscheBank=" + deutscheBank + ", corporationBank=" + corporationBank
				+ ", ucoBank=" + ucoBank + ", indianBank=" + indianBank + ", fedralBank=" + fedralBank + ", ingVysya="
				+ ingVysya + "]";
	}
	
	
	public NetBankingBooking() {
		super();
		this.nbId = nbId;
		this.andhraBank = andhraBank;
		this.allahabadBank = allahabadBank;
		this.bankofBaroda = bankofBaroda;
		this.canaraBank = canaraBank;
		this.idbiBank = idbiBank;
		this.iciciBank = iciciBank;
		this.indianOverseasBank = indianOverseasBank;
		this.punjabNationalBank = punjabNationalBank;
		this.southIndianBank = southIndianBank;
		this.sbi = sbi;
		this.cityUnionBank = cityUnionBank;
		this.hdfcBank = hdfcBank;
		this.indusIndBank = indusIndBank;
		this.syndicateBank = syndicateBank;
		this.deutscheBank = deutscheBank;
		this.corporationBank = corporationBank;
		this.ucoBank = ucoBank;
		this.indianBank = indianBank;
		this.fedralBank = fedralBank;
		this.ingVysya = ingVysya;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
