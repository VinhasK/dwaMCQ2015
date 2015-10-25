package com.example;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component 
public class TempQuestionRep implements QuestionRep {
	ArrayList<Question> ArrayQuest;

	TempQuestionRep(){
		ArrayQuest= new ArrayList<Question>(); 
		Question v1= new Question();
		v1.setStringQuestion("De quelle couleur est mon slip?");
		add(v1);
	}
	
	public ArrayList<Question> getArrayQuest() {
		return ArrayQuest;
	}

	public void setArrayVeg(ArrayList<Question> arrayVeg) {
		ArrayQuest = arrayVeg;
	}

	
	public ArrayList<Question> findAll() {
		return this.getArrayQuest() ;
	}

	
	public void add(Question quest) {
		this.ArrayQuest.add(quest);
	}
	
}

