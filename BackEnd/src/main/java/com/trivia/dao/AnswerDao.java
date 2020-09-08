package com.trivia.dao;

import java.util.List;

import com.trivia.model.Answer;

public interface AnswerDao {

	// create
	void createAnswer(Answer answer);

	// read

	// update
	Answer updateAnswer(Answer answer);

	// delete
	void deleteAnswer(String answer);

	// get all answers
	List<Answer> getAllAnswers();
}
