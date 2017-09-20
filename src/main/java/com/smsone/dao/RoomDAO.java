package com.smsone.dao;

import java.util.List;
import java.util.Set;

import com.smsone.model.Beds;
import com.smsone.model.Room;
import com.smsone.model.User;

public interface RoomDAO {
	public void saveRoom(Room room,Long hId);
	public void assignBed(User user,Beds beds);
	public List<User> getAllBedDetails();
	public List<Room> getAllRoomDetails(Long hId);
	public Long countRooms(Long hId);
	public Long countBeds(Long rId);
	public User getUser(Long bId);
	public Room getRoom(Room room);
	public void updateRoom(Room room);
}
