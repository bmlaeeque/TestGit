package com.smsone.service;

import java.util.List;

import com.smsone.model.House;
import com.smsone.model.User;


public interface HouseService {
	public void saveHouse(House house,Long oId);
	public List<House> list(Integer offset, Integer maxResults);
	public Long count();
	public House getHouse(House house);
	public List<House> listHouse(House house,Integer offset, Integer maxResults);
	public List<House> listHouseByFilter(House house,Integer offset, Integer maxResults);
	public List<House> listHouseByFilters(House house,Integer offset, Integer maxResults);
	public boolean checkAadharNumber(House house);
	public Long countByFilter(House house);
	public List<House> listHouseByadvancedFilter(House house,User user,Integer offset, Integer maxResults,String[] facilities);
	public void saveLat(House house);
}
