package com.trivia.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trivia.dao.CategoryDao;
import com.trivia.dao.CategoryDaoImpl;
import com.trivia.dao.QuestionDao;
import com.trivia.dao.QuestionDaoImpl;
import com.trivia.model.Category;
import com.trivia.model.Question;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryDaoImpl categoryDaoImpl;

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Category createCategory(@RequestBody Category category) {
		System.out.println(category);
		categoryDaoImpl.createCategory(category);
		return category;
	}

	@GetMapping("/getall")
	public List<Category> getAll() {
		return categoryDaoImpl.getAllCategories();
	}

	@GetMapping(value = "/{categoryName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Question> getQUestionsByCategoryName(@PathVariable("categoryName") String categoryName) {
		return categoryDaoImpl.getAllQuestionsPerCategory(categoryName);
	}

	@PutMapping("/update")
	public void updateCategory(Category category) {
		categoryDaoImpl.updateCategory(category);
	}

	@DeleteMapping("/delete/{categoryname}")
	public void removeCategory(@PathVariable("categoryname") String categoryname) {
		categoryDaoImpl.deleteCategory(categoryname);
	}
}
