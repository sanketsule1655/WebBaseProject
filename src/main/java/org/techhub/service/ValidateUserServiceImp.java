package org.techhub.service;

import java.util.List;

import org.techhub.model.LoginModel;
import org.techhub.model.VendorModel;
import org.techhub.repository.ValidateUserRepository;
import org.techhub.repository.ValidateUserRepositoryImp;

public class ValidateUserServiceImp implements ValidateUserService
{
	ValidateUserRepository vandRepo = new ValidateUserRepositoryImp();
	public LoginModel isValidateUser(LoginModel model)
	{
		return vandRepo.isValidate(model);
	}
	@Override
	public List<VendorModel> getVendorList() {
		return vandRepo.getVendorList();
	}
}
