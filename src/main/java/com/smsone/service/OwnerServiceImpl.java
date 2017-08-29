package com.smsone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsone.dao.OwnerDAO;
import com.smsone.model.Owner;
import com.smsone.model.User;

@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	OwnerDAO ownerDAO;
	public void saveOwner(Owner owner)
	{
		ownerDAO.saveOwner(owner);
		
		
	}
	public boolean checkContactNumber(Owner owner) {
		return ownerDAO.checkContactNumber(owner);
	}
	public boolean checkAadharNumber(Owner owner) {
		return ownerDAO.checkAadharNumber(owner);
	}
	public boolean checkEmail(Owner owner) {
		return ownerDAO.checkEmail(owner);
	}
	public Owner checkOwnerLogin(Owner owner)
	{
		return ownerDAO.checkOwnerLogin(owner);
	}
	public Owner verifyOwnerAccount(Owner owner) {
		return ownerDAO.verifyOwnerAccount(owner);
	}
	public Owner sendNewLink(Owner owner) {
		return ownerDAO.sendNewLink(owner);
	}

}
