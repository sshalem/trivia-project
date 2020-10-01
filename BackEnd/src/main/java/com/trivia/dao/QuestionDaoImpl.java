package com.trivia.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trivia.model.Question;
import com.trivia.repository.QuestionRepository;

@Service
public class QuestionDaoImpl implements QuestionDao {

	@Autowired
	private QuestionRepository quesRepo;

	@Override
	public void createQuestion(Question question) {
		quesRepo.save(question);
	}

	@Override
	public Question findByQuestionName(String questionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteQuestion(Question question) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

}
