package org.techhub.service;

import org.techhub.model.SubAdminModel;
import org.techhub.repository.SubAdminRepository;
import org.techhub.repository.SubAdminRepositoryImp;

public class SubAdminServiceImp implements SubAdminService {
	SubAdminRepository subAdminRepo = new SubAdminRepositoryImp();

	@Override
	public boolean isAddNewSubAdmin(SubAdminModel model) {

		return subAdminRepo.isAddNewSubAdmin(model);
	}
}
