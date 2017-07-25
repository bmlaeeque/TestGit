package com.smsone.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,unique = true)
	private Long uId;
	@Column(nullable=false,length=12,unique = true)
	private Long aadharNumber;
	@Column(nullable=false,length=20)
	private String firstName;
	@Column(nullable=false,length=20)
	private String lastName;
	@Column(nullable=false,length=10)
	private Long contactNumber;
	@Column(nullable=false,length=30,unique = true)
	private String email;
	@Column(nullable=false,length=100)
	private String address;
	@Column(nullable=false,length=6)
	private Integer pincode;
	@Column(nullable=false,length=20)
	private String city;
	@Column(nullable=false,length=20)
	private String state;
	@Column(nullable=false,length=20)
	private String country;
	@Column(length=6)
	private String gender;
	@Column(nullable=false,length=20)
	private String motherTongue;
	@Column(nullable=false,length=20)
	private String foodPreference;
	@Column(nullable=false,length=20)
	private String profession;
	@Column(nullable=false,length=20)
	private String area;
	@Column(nullable=false,length=20)
	private String password;
	@Column(nullable=true)
	private Long RefId;
	@ManyToOne
    @JoinColumn(name = "hId")
	private House house;
	public Long getuId() {
		return uId;
	}
	public void setuId(Long uId) {
		this.uId = uId;
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMotherTongue() {
		return motherTongue;
	}
	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}
	public String getFoodPreference() {
		return foodPreference;
	}
	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getRefId() {
		return RefId;
	}
	public void setRefId(Long refId) {
		RefId = refId;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public User() {
		super();
	}
	public User(Long uId, Long aadharNumber, String firstName, String lastName, Long contactNumber, String email,
			String address, Integer pincode, String city, String state, String country, String gender,
			String motherTongue, String foodPreference, String profession, String area, String password, Long refId,
			House house) {
		super();
		this.uId = uId;
		this.aadharNumber = aadharNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.gender = gender;
		this.motherTongue = motherTongue;
		this.foodPreference = foodPreference;
		this.profession = profession;
		this.area = area;
		this.password = password;
		RefId = refId;
		this.house = house;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((RefId == null) ? 0 : RefId.hashCode());
		result = prime * result + ((aadharNumber == null) ? 0 : aadharNumber.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((foodPreference == null) ? 0 : foodPreference.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((motherTongue == null) ? 0 : motherTongue.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((profession == null) ? 0 : profession.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((uId == null) ? 0 : uId.hashCode());
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
		User other = (User) obj;
		if (RefId == null) {
			if (other.RefId != null)
				return false;
		} else if (!RefId.equals(other.RefId))
			return false;
		if (aadharNumber == null) {
			if (other.aadharNumber != null)
				return false;
		} else if (!aadharNumber.equals(other.aadharNumber))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (foodPreference == null) {
			if (other.foodPreference != null)
				return false;
		} else if (!foodPreference.equals(other.foodPreference))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (house == null) {
			if (other.house != null)
				return false;
		} else if (!house.equals(other.house))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (motherTongue == null) {
			if (other.motherTongue != null)
				return false;
		} else if (!motherTongue.equals(other.motherTongue))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (profession == null) {
			if (other.profession != null)
				return false;
		} else if (!profession.equals(other.profession))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (uId == null) {
			if (other.uId != null)
				return false;
		} else if (!uId.equals(other.uId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", aadharNumber=" + aadharNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", contactNumber=" + contactNumber + ", email=" + email + ", address=" + address
				+ ", pincode=" + pincode + ", city=" + city + ", state=" + state + ", country=" + country + ", gender="
				+ gender + ", motherTongue=" + motherTongue + ", foodPreference=" + foodPreference + ", profession="
				+ profession + ", area=" + area + ", password=" + password + ", RefId=" + RefId + ", house=" + house
				+ "]";
	}
}
