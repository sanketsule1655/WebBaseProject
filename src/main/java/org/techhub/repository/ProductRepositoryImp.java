package org.techhub.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.techhub.model.CategoryModel;
import org.techhub.model.ProductModel;
import org.techhub.model.VendorModel;
import org.techhub.model.VendorProductCatJoinModel;

public class ProductRepositoryImp extends DBParent implements ProductRepository
{
	List<ProductModel> list;
	List<VendorProductCatJoinModel> vendList;
	@Override
	public boolean isAddNewProduct(ProductModel model) {
		try
		{
			stmt=conn.prepareStatement("insert into product values('0',?)");
			stmt.setString(1, model.getName());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is:"+ex);
			return false;
		}
	}

	@Override
	public List<ProductModel> getAllProducts() {
	    try
	    {
	    	stmt=conn.prepareStatement("select *from product");
			rs=stmt.executeQuery();
			list=new ArrayList<ProductModel>();
			while(rs.next())
			{
				ProductModel model=new ProductModel();
				model.setId(rs.getInt(1));
				model.setName(rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
	    }
	    catch(Exception ex)
	    {
	    	System.out.println("Error is:"+ex);
	    	return null;
	    }
	}

	@Override
	public boolean isAddNewProductWithDetail(VendorProductCatJoinModel model) {
		try
		{
			VendorModel vm=model.getVendorModel();
			ProductModel pm=model.getProductModel();
			CategoryModel cm=model.getCategoryModel();
			Date md=Date.valueOf(model.getManDate());
			Date ed=Date.valueOf(model.getExpDate());
			stmt=conn.prepareStatement("insert into vandorprodcatjoin values(?,?,?,?,?,?)");
			stmt.setInt(1, vm.getId());
			stmt.setInt(2, pm.getId());
			stmt.setInt(3, cm.getId());
			stmt.setInt(4, model.getPrice());
			stmt.setDate(5, md);
			stmt.setDate(6, ed);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}

	@Override
	public List<VendorProductCatJoinModel> getVendorProductCategoryList() {
		try
		{
			vendList=new ArrayList<VendorProductCatJoinModel>();
			stmt=conn.prepareStatement("select v.name,pc.categoryname,p.pname,vpcj.price,vpcj.mandate,vpcj.expdate,v.vid,pc.cid,p.pid from vendor v inner join vendorprodcatjoin vpcj on v.vid=vpcj.vid inner join product p on p.pid=vpcj.pid inner join productcategory pc on vpcj.cid=pc.cid");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				VendorProductCatJoinModel vmodel=new VendorProductCatJoinModel();
				
				VendorModel vendModel=new VendorModel();
				vendModel.setName(rs.getString(1));
				vendModel.setId(rs.getInt(7));
				
				CategoryModel catModel=new CategoryModel();
				catModel.setName(rs.getString(2));
				catModel.setId(rs.getInt(8));
				
				ProductModel prodModel=new ProductModel();
				prodModel.setName(rs.getString(3));
				prodModel.setId(rs.getInt(9));
				
				vmodel.setVendorModel(vendModel);
				vmodel.setCategoryModel(catModel);
				vmodel.setProductModel(prodModel);
				vmodel.setPrice(rs.getInt(4));
				vmodel.setManDate(rs.getDate(5).toString());
				vmodel.setExpDate(rs.getDate(6).toString());
				vendList.add(vmodel);
			}
			return vendList.size()>0?vendList:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}

	@Override
	public List<VendorProductCatJoinModel> getVendorProductCategoryList(int vid) {
		try
		{
			vendList=new ArrayList<VendorProductCatJoinModel>();
			stmt=conn.prepareStatement("select v.name,pc.categoryname,p.pname,vpcj.price,vpcj.mandate,vpcj.expdate,v.vid,pc.cid,p.pid from vendor v inner join vendorprodcatjoin vpcj on v.vid=vpcj.vid inner join product p on p.pid=vpcj.pid inner join productcategory pc on vpcj.cid=pc.cid where v.vid="+vid);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				VendorProductCatJoinModel vmodel=new VendorProductCatJoinModel();
				
				VendorModel vendModel=new VendorModel();
				vendModel.setName(rs.getString(1));
				vendModel.setId(rs.getInt(7));
				
				CategoryModel catModel=new CategoryModel();
				catModel.setName(rs.getString(2));
				catModel.setId(rs.getInt(8));
				
				ProductModel prodModel=new ProductModel();
				prodModel.setName(rs.getString(3));
				prodModel.setId(rs.getInt(9));
				
				vmodel.setVendorModel(vendModel);
				vmodel.setCategoryModel(catModel);
				vmodel.setProductModel(prodModel);
				vmodel.setPrice(rs.getInt(4));
				vmodel.setManDate(rs.getDate(5).toString());
				vmodel.setExpDate(rs.getDate(6).toString());
				vendList.add(vmodel);
			}
			return vendList.size()>0?vendList:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return null;
		}
	}
}
