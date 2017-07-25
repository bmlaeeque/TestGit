package com.smsone.dao;

import java.util.List;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.User;


public interface HouseDAO {
	public void saveHouse(House house,Long oId);
	public List<House> list(Integer offset, Integer maxResults);
	public List<House> listHouse(House house,Integer offset, Integer maxResults);
	public List<House> listHouseByFilter(House house,Integer offset, Integer maxResults);
	public List<House> listHouseByFilters(House house,Integer offset, Integer maxResults);
	public Long count();
	public House getHouse(House house);
	public boolean checkAadharNumber(House house);
	public Long countByFilter(House house);
	public Long countAllFilter(House house);
	public List<House> listHouseByadvancedFilter(House house,User user,Integer offset, Integer maxResults,String[] facilities);
	public void saveBed(Beds beds,Long rid);
}
