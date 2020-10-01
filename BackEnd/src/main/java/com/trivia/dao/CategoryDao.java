package com.trivia.dao;

import java.util.List;

import com.trivia.model.Category;
import com.trivia.model.Question;

public interface CategoryDao {

	// create
	void createCategory(Category category);

	// Read
	Category findByCategoryName(String categoryName);

	// update
	void updateCategory(Category category);

	// delete
	void deleteCategory(String categoryName);

	// get all
	List<Category> getAllCategories();

	// Get All question Per Category
	List<Question> getAllQuestionsPerCategory(String name);
}
