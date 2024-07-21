package org.techhub.service;

import java.util.List;

import org.techhub.model.ProductModel;
import org.techhub.model.VendorProductCatJoinModel;

public interface ProductService 
{
	public boolean isAddNewProduct(ProductModel model);
	public List<ProductModel> getAllProducts();
	public boolean isAddNewProductWithDetail(VendorProductCatJoinModel model);
	public List<VendorProductCatJoinModel> getVendorProductCategoryList();
	public List<VendorProductCatJoinModel> getVendorProductCategoryList(int vid);
}
