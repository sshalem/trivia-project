package com.trivia.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trivia.model.Category;
import com.trivia.repository.CategoryRepository;

@Service
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	public CategoryRepository categoryRepo;

	@Override
	public void createCategory(Category category) {
		categoryRepo.save(category);
	}

	@Override
	public Category findByCategoryName(String categoryName) {
		return categoryRepo.findByCategoryName(categoryName);
	}

	@Override
	public void updateCategory(Category category) {
		categoryRepo.save(category);
	}

	@Override
	public void deleteCategory(String categoryName) {
		categoryRepo.delete(this.findByCategoryName(categoryName));
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepo.findAll();
	}

}
