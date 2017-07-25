package com.smsone.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Beds implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bId;
	@Column(nullable=false,length=20)
	private String direction;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uId")
	private User user;
	@ManyToOne
    @JoinColumn(name = "rId")
	private Room room;
	public Long getbId() {
		return bId;
	}
	public void setbId(Long bId) {
		this.bId = bId;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
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
	public Beds(Long bId, String direction, User user, Room room) {
		super();
		this.bId = bId;
		this.direction = direction;
		this.user = user;
		this.room = room;
	}
	public Beds() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bId == null) ? 0 : bId.hashCode());
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Beds other = (Beds) obj;
		if (bId == null) {
			if (other.bId != null)
				return false;
		} else if (!bId.equals(other.bId))
			return false;
		if (direction == null) {
			if (other.direction != null)
				return false;
		} else if (!direction.equals(other.direction))
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
		return true;
	}
	@Override
	public String toString() {
		return "Beds [bId=" + bId + ", direction=" + direction + ", user=" + user + ", room=" + room + "]";
	}
	
	
	
}
