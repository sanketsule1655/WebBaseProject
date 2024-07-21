package org.techhub.service;

import java.util.List;

import org.techhub.model.VendorModel;
import org.techhub.model.VendorProductCatJoinModel;

public interface VendorService 
{
	public boolean isAddNewVendor(VendorModel model);
	public List<VendorModel> getVendorList(); 
	public boolean isDeleteVendorById(int vendorid);
	public List<VendorModel> getVendorListByName(String name);
	public List<VendorProductCatJoinModel> getVendorProductCategoryList();
}
