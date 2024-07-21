package org.techhub.service;

import java.util.Set;

import org.techhub.model.CategoryModel;

public interface CategoryService 
{
	public boolean isAddNewCategory(CategoryModel model);
	public Set<CategoryModel> getAllCategories();
}
