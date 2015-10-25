package com.example;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Question {
	String stringQuestion;
	ArrayList<Answer> answers ;
	int numberAnswer;
	@Id @GeneratedValue
	Long id;

	
	Question(){
		answers= new ArrayList<Answer>();
		stringQuestion="";
	}

	public String getStringQuestion() {
		return stringQuestion;
	}
	public void setStringQuestion(String question) {
		this.stringQuestion = question;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<Answer> answers) {
		this.answers = answers;
	}
	
	
}
