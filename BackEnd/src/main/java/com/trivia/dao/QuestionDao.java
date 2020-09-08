package com.trivia.dao;

import java.util.List;

import com.trivia.model.Question;

public interface QuestionDao {

	// create
	void createQuestion(Question question);

	// read
	Question findByQuestionName(String questionName);

	// update
	void updateQuestion(Question question);

	// delete
	void deleteQuestion(Question question);

	List<Question> getAllQuestions();
}
