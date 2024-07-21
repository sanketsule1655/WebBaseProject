package org.techhub.service;

import java.util.List;

import org.techhub.model.LoginModel;
import org.techhub.model.VendorModel;

public interface ValidateUserService 
{
	public LoginModel isValidateUser(LoginModel model);
	public List<VendorModel> getVendorList();
}
