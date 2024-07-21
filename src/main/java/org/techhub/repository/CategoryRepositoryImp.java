package org.techhub.repository;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.techhub.model.CategoryModel;

public class CategoryRepositoryImp extends DBParent implements CategoryRepository
{
	Set<CategoryModel> catSet;
	@Override
	public boolean isAddNewCategory(CategoryModel model) {
		try
		{
			stmt=conn.prepareStatement("insert into productcategory values('0',?)");
			stmt.setString(1, model.getName());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			return false;
		}
	}

	@Override
	public Set<CategoryModel> getAllCategories() {
		try
		{
			catSet=new LinkedHashSet<CategoryModel>();
			stmt=conn.prepareStatement("select *from productcategory");
			rs=stmt.executeQuery();while(rs.next())
			{
				CategoryModel cmodel=new CategoryModel();
				cmodel.setId(rs.getInt(1));
				cmodel.setName(rs.getString(2));
				catSet.add(cmodel);
			}
			return catSet.size()>0?catSet:null;
		}
		catch(Exception ex)
		{
			return null;
		}
	}
}
