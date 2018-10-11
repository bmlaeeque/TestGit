package com.smsone.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="MEMBER")
@Table
public class Member implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,unique = true)
	private Long mId;
	 /*@OneToMany(mappedBy = "member")
	    private Set<Owner> owner;*/
	@Column(nullable=false,length=20)
	private String firstName;
	@Column(nullable=false,length=20)
	private String lastName; 
	@Column(nullable=false,length=30)
	private String email;
	@Column(nullable=false,length=12,unique = true)
	private Long aadharNumber;
	@Column(nullable=false,length=10)
	private Long contactNumber;
	@Column(nullable=false,length=20)
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="owner")
	private List<House> house;
	
	@Column(nullable=false,length=50)
	private String memberHashcode;
	@Column(length=20)
	private Long attempts;
	@Column(length=20)
	private String memberStatus;
	@Column(name="CREATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date memberCreation_date;
	@Column(name="Email_ResendTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date emailResendTime;
	public Long getmId() {
		return mId;
	}
	public void setmId(Long mId) {
		this.mId = mId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<House> getHouse() {
		return house;
	}
	public void setHouse(List<House> house) {
		this.house = house;
	}
	public String getMemberHashcode() {
		return memberHashcode;
	}
	public void setMemberHashcode(String memberHashcode) {
		this.memberHashcode = memberHashcode;
	}
	public Long getAttempts() {
		return attempts;
	}
	public void setAttempts(Long attempts) {
		this.attempts = attempts;
	}
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public Date getMemberCreation_date() {
		return memberCreation_date;
	}
	public void setMemberCreation_date(Date memberCreation_date) {
		this.memberCreation_date = memberCreation_date;
	}
	public Date getEmailResendTime() {
		return emailResendTime;
	}
	public void setEmailResendTime(Date emailResendTime) {
		this.emailResendTime = emailResendTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharNumber == null) ? 0 : aadharNumber.hashCode());
		result = prime * result + ((attempts == null) ? 0 : attempts.hashCode());
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((emailResendTime == null) ? 0 : emailResendTime.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		result = prime * result + ((memberCreation_date == null) ? 0 : memberCreation_date.hashCode());
		result = prime * result + ((memberHashcode == null) ? 0 : memberHashcode.hashCode());
		result = prime * result + ((memberStatus == null) ? 0 : memberStatus.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Member other = (Member) obj;
		if (aadharNumber == null) {
			if (other.aadharNumber != null)
				return false;
		} else if (!aadharNumber.equals(other.aadharNumber))
			return false;
		if (attempts == null) {
			if (other.attempts != null)
				return false;
		} else if (!attempts.equals(other.attempts))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (emailResendTime == null) {
			if (other.emailResendTime != null)
				return false;
		} else if (!emailResendTime.equals(other.emailResendTime))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
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
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		if (memberCreation_date == null) {
			if (other.memberCreation_date != null)
				return false;
		} else if (!memberCreation_date.equals(other.memberCreation_date))
			return false;
		if (memberHashcode == null) {
			if (other.memberHashcode != null)
				return false;
		} else if (!memberHashcode.equals(other.memberHashcode))
			return false;
		if (memberStatus == null) {
			if (other.memberStatus != null)
				return false;
		} else if (!memberStatus.equals(other.memberStatus))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Member [mId=" + mId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", aadharNumber=" + aadharNumber + ", contactNumber=" + contactNumber + ", password=" + password
				+ ", house=" + house + ", memberHashcode=" + memberHashcode + ", attempts=" + attempts
				+ ", memberStatus=" + memberStatus + ", memberCreation_date=" + memberCreation_date
				+ ", emailResendTime=" + emailResendTime + "]";
	}
	public Member() {
		super();
		this.mId = mId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.aadharNumber = aadharNumber;
		this.contactNumber = contactNumber;
		this.password = password;
		this.house = house;
		this.memberHashcode = memberHashcode;
		this.attempts = attempts;
		this.memberStatus = memberStatus;
		this.memberCreation_date = memberCreation_date;
		this.emailResendTime = emailResendTime;
	}
	
	
	
	
}
