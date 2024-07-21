package org.techhub.service;

import java.util.Set;

import org.techhub.model.CategoryModel;
import org.techhub.repository.CategoryRepository;
import org.techhub.repository.CategoryRepositoryImp;
import org.techhub.repository.DBParent;

public class CategoryServiceImp  implements CategoryService
{
	CategoryRepository catRepo = new CategoryRepositoryImp();
	@Override
	public boolean isAddNewCategory(CategoryModel model) {
		
		return catRepo.isAddNewCategory(model);
	}
	@Override
	public Set<CategoryModel> getAllCategories() {
		
		return catRepo.getAllCategories();
	}

}
