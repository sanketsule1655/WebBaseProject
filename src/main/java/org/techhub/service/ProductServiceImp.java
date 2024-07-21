package org.techhub.service;

import java.util.List;

import org.techhub.model.ProductModel;
import org.techhub.model.VendorProductCatJoinModel;
import org.techhub.repository.ProductRepository;
import org.techhub.repository.ProductRepositoryImp;

public class ProductServiceImp implements ProductService
{
	ProductRepository prodRepo=new ProductRepositoryImp();
	@Override
	public boolean isAddNewProduct(ProductModel model) {
		
		return prodRepo.isAddNewProduct(model);
	}
	@Override
	public List<ProductModel> getAllProducts() {
		
		return prodRepo.getAllProducts();
	}
	@Override
	public boolean isAddNewProductWithDetail(VendorProductCatJoinModel model) {
		
		return prodRepo.isAddNewProductWithDetail(model);
	}
	@Override
	public List<VendorProductCatJoinModel> getVendorProductCategoryList() {
		return prodRepo.getVendorProductCategoryList();
	}
	@Override
	public List<VendorProductCatJoinModel> getVendorProductCategoryList(int vid) {
		// TODO Auto-generated method stub
		return prodRepo.getVendorProductCategoryList(vid);
	}
}
