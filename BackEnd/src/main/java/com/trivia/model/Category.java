package com.trivia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cat_id")
	private long id;

	private String categoryName;

	@OneToMany(mappedBy = "category")
	private List<Question> questionsList;

	public Category() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return categoryName;
	}

	public void setCategory(String category) {
		this.categoryName = category;
	}
 
	public List<Question> getQuestionsList() {
		return questionsList;
	}

	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}

	public void addQuestion(Question question) {
		if (this.questionsList == null) {
			this.questionsList = new ArrayList<>();
		}
		questionsList.add(question);
		question.setCategory(this);
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + categoryName + ", questionsList=" + questionsList + "]";
	}

}
