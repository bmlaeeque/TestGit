package com.smsone.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Booking implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pId;
	@Column(nullable=false,length=20)
	private String Name;
	@Column(nullable=false,length=20)
	private Integer CardNumber;
	@Column(nullable=false,length=20)
	private String month;
	@Column(nullable=false,length=20)
	private Integer year;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(Long pId, String name, Integer cardNumber, String month, Integer year, Integer cvc, Beds beds,
			User user, Room room) {
		super();
		this.pId = pId;
		Name = name;
		CardNumber = cardNumber;
		this.month = month;
		this.year = year;
		this.cvc = cvc;
		this.beds = beds;
		this.user = user;
		this.room = room;
	}
	
	public Booking(String name, Integer cardNumber, String month, Integer year, Integer cvc) {
		super();
		Name = name;
		CardNumber = cardNumber;
		this.month = month;
		this.year = year;
		this.cvc = cvc;
	}
	@Override
	public String toString() {
		return "Booking [pId=" + pId + ", Name=" + Name + ", CardNumber=" + CardNumber + ", month=" + month + ", year="
				+ year + ", cvc=" + cvc + ", beds=" + beds + ", user=" + user + ", room=" + room + ", hashCode()="
				+ hashCode() + ", getpId()=" + getpId() + ", getName()=" + getName() + ", getCardNumber()="
				+ getCardNumber() + ", getMonth()=" + getMonth() + ", getYear()=" + getYear() + ", getCvc()=" + getCvc()
				+ ", getBeds()=" + getBeds() + ", getUser()=" + getUser() + ", getRoom()=" + getRoom() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CardNumber == null) ? 0 : CardNumber.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((beds == null) ? 0 : beds.hashCode());
		result = prime * result + ((cvc == null) ? 0 : cvc.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((pId == null) ? 0 : pId.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		Booking other = (Booking) obj;
		if (CardNumber == null) {
			if (other.CardNumber != null)
				return false;
		} else if (!CardNumber.equals(other.CardNumber))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (beds == null) {
			if (other.beds != null)
				return false;
		} else if (!beds.equals(other.beds))
			return false;
		if (cvc == null) {
			if (other.cvc != null)
				return false;
		} else if (!cvc.equals(other.cvc))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (pId == null) {
			if (other.pId != null)
				return false;
		} else if (!pId.equals(other.pId))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(Integer cardNumber) {
		CardNumber = cardNumber;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getCvc() {
		return cvc;
	}
	public void setCvc(Integer cvc) {
		this.cvc = cvc;
	}
	public Beds getBeds() {
		return beds;
	}
	public void setBeds(Beds beds) {
		this.beds = beds;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(nullable=false,length=20)
	private Integer cvc;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bId")
	private Beds beds;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uId")
	private User user;
	@ManyToOne
    @JoinColumn(name = "rId") 
	private Room room;
	
}
