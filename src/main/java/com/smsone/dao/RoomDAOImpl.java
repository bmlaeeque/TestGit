package com.smsone.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Room;
import com.smsone.model.User;
@Repository
public class RoomDAOImpl implements RoomDAO {
	@Autowired
	private SessionFactory sessionFactory;
	//save room
	public void saveRoom(Room room,Long hId) {
		Session session=sessionFactory.openSession();
		House house=(House)session.load(House.class,hId);
		room.setHouse(house);
		session.save(room);
		for(int i=1;i<=room.getNumberOfBed();i++)
		{
			Beds beds=new Beds();
			beds.setBedId(new Long(i));
			Room room1=(Room)session.load(Room.class,room.getrId());
			beds.setRoom(room1);
			session.save(beds);
		}
		session.close();
	}
	public void assignBed(User user, Beds beds) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		User user1=(User)session.get(User.class,user.getuId());
		Beds beds1=(Beds)session.get(Beds.class,beds.getbId());
		beds1.setUser(user1);
		session.save(beds1);
		tx.commit();
		session.close();
	}
	public List<User> getAllBedDetails() {
		Session session=sessionFactory.openSession();	
		
		return null;
	}
	@SuppressWarnings("unchecked")
	public List<Room> getAllRoomDetails(Long hId) {
		Session session=sessionFactory.openSession();
		House house=(House)session.load(House.class,hId);
		List<Room> room=house.getRooms();
		if(room!=null)
		{
		return room;
		}
		else
		{
			return null;
		}
	}
	
	public Long countRooms(Long hId) {
		Session session=sessionFactory.openSession();
		House house=(House)session.load(House.class, hId);
		List<Room> room=house.getRooms();
		int count=room.size();
		Long c=new Long(count);
		session.close();
		return c;
	}
	public Long countBeds(Long rId) {
		Session session=sessionFactory.openSession();
		Room room=(Room)session.load(Room.class, rId);
		List<Beds> beds=room.getBeds();
		int count=beds.size();
		Long bedCount=new Long(count);
		session.close();
		return bedCount;
	}
	
	public User getUser(Long bId) {
		Session session=sessionFactory.openSession();
		Beds beds=(Beds)session.load(Beds.class,bId);
		User user1=beds.getUser();
		if(user1!=null)
		{
		return user1;
		}
		else
		{
			return null;
		}
		
	}
	
	
	
}
