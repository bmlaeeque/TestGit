package com.smsone.service;

import java.util.List;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Room;
import com.smsone.model.User;


public interface HouseService {
	public void saveHouse(House house,Long oId);
	public void updateHouse(House house);
	public void deleteHouse(House house);
	public List<House> remainingOwnerHouse(Long oId);
	public List<Room> getRooms(House house);
	public List<House> list(Integer offset, Integer maxResults);
	public Long count();
	public House getHouse(House house);
	public List<House> listHouse(House house,Integer offset, Integer maxResults);
	public List<House> listHouseByFilter(House house,Integer offset, Integer maxResults);
	public List<House> listHouseByFilters(House house,Integer offset, Integer maxResults);
	public boolean checkAadharNumber(House house);
	public Long countByFilter(House house);
	public List<House> listHouseByadvancedFilter(House house,User user,Integer offset, Integer maxResults,String[] facilities);
	public void saveBed(Beds beds,Long rid);
	public List<House> applySorting(House house,User user);
}
