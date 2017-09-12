package com.smsone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsone.dao.RoomDAO;
import com.smsone.model.Beds;
import com.smsone.model.Room;
import com.smsone.model.User;
@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	RoomDAO roomDAO;

	public void saveRoom(Room room,Long hId) {
		roomDAO.saveRoom(room,hId);
	}

	public void assignBed(User user, Beds beds) {
		roomDAO.assignBed(user, beds);
		
	}

	public List<Room> getAllRoomDetails(Long hId) {
		return roomDAO.getAllRoomDetails(hId);
	}

	public Long countRooms(Long hId) {
		return roomDAO.countRooms(hId);
	}

	public Long countBeds(Long rId) {
		return roomDAO.countBeds(rId);
	}

	public List<User> getUsers(List<Beds> beds) {
		return roomDAO.getUsers(beds);
	}

	public Room getRoom(Long rId) {
		return roomDAO.getRoom(rId);
	}

	public List<Beds> getAllBedDetails(Long rId) {
		return roomDAO.getAllBedDetails(rId);
	}

	
	
}
