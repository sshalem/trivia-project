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
import com.trivia.model.Category;

@RestController
@RequestMapping(value = "/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryDao categoryDao;

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCategory(@RequestBody Category category) {
		System.out.println(category);
		categoryDao.createCategory(category);
	}

	@GetMapping("/getall")
	public List<Category> getAll() {
		return categoryDao.getAllCategories();
	}

	@PutMapping("/update")
	public void updateCategory(Category category) {
		categoryDao.updateCategory(category);
	}

	@DeleteMapping("/delete/{categoryname}")
	public void removeCategory(@PathVariable("categoryname") String categoryname) {
		categoryDao.deleteCategory(categoryname);
	}
}
