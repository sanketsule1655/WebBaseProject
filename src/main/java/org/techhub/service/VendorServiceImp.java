package org.techhub.service;

import java.util.List;

import org.techhub.model.VendorModel;
import org.techhub.model.VendorProductCatJoinModel;
import org.techhub.repository.VendorRepository;
import org.techhub.repository.VendorRepositoryImp;

public class VendorServiceImp implements VendorService
{
VendorRepository vendRepo = new VendorRepositoryImp();
	@Override
	public boolean isAddNewVendor(VendorModel model) 
	{
		return vendRepo.isAddNewVendor(model);
	}
	@Override
	public List<VendorModel> getVendorList() {
		
		return vendRepo.getVendorList();
	}
	@Override
	public boolean isDeleteVendorById(int vendorid) {
		return vendRepo.isDeleteVendor(vendorid);
	}
	@Override
	public List<VendorModel> getVendorListByName(String name) {
		return vendRepo.getVendorListByName(name);
	}
	@Override
	public List<VendorProductCatJoinModel> getVendorProductCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}

}
