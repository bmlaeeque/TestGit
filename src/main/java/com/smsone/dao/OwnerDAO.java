package com.smsone.dao;

import com.smsone.model.Owner;
import com.smsone.model.User;


public interface OwnerDAO {
	public void saveOwner(Owner owner);
	public boolean checkContactNumber(Owner owner);
	public boolean checkAadharNumber(Owner owner);
	public boolean checkEmail(Owner owner);
	public Owner checkOwnerLogin(Owner owner);
	public Owner verifyOwnerAccount(Owner owner);
	public Owner sendNewLink(Owner owner);
}
