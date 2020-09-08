package com.trivia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trivia.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Question findByQuestion(String questionName);
}
