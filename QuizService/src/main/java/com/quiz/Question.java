package com.quiz;



public class Question {
	
	private Long questionId;
	private String Question;
	private Long quizId;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(Long questionId, String question, Long quizId) {
		super();
		this.questionId = questionId;
		Question = question;
		this.quizId = quizId;
	}
	
	
	
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	
	

}
