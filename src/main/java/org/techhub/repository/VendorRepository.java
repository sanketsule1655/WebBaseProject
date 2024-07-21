package org.techhub.repository;

import java.util.List;

import org.techhub.model.VendorModel;

public interface VendorRepository 
{
	public boolean isAddNewVendor(VendorModel model);
	public List<VendorModel> getVendorList();
	public boolean isDeleteVendor(int vendorId);
	public List<VendorModel> getVendorListByName(String name); 
}
