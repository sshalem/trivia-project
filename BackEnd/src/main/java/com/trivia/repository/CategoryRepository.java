package com.trivia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trivia.model.Category;
import com.trivia.model.Question;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findBycategoryName(String categoryName);

	@Query("SELECT questions FROM Category category JOIN category.questionsList AS questions WHERE category.categoryName=:name")
	List<Question> getAllQuestionsPerCategory(@Param("name") String name);
}
