package com.quiz.service;

import java.util.List;

import com.quiz.Quiz;


public interface QuizService {
	List<Quiz> getAll();
	Quiz findQuiz(Long Id);
	Quiz Create(Quiz quiz);
}
