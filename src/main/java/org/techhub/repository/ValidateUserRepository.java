package org.techhub.repository;

import java.util.List;

import org.techhub.model.LoginModel;
import org.techhub.model.VendorModel;

public interface ValidateUserRepository 
{
	public LoginModel isValidate(LoginModel model);

	public List<VendorModel> getVendorList();
}
