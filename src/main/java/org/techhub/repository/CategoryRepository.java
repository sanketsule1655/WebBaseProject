package org.techhub.repository;

import java.util.List;
import java.util.Set;

import org.techhub.model.CategoryModel;

public interface CategoryRepository 
{
	public boolean isAddNewCategory(CategoryModel model);
	public Set<CategoryModel> getAllCategories();
}
