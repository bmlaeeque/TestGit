package com.smsone.dao;

import java.util.List;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Room;
import com.smsone.model.User;

public interface RoomDAO {
	public void saveRoom(Room room,Long hId);
	public void assignBed(User user,Beds beds);
	public List<User> getAllBedDetails();
	public List<Room> getAllRoomDetails(Long hId);
	public Long countRooms(Long hId);
}
