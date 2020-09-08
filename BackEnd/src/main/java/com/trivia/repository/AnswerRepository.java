package com.trivia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trivia.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
