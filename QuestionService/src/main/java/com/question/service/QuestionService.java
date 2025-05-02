package com.question.service;

import java.util.List;

import com.question.Question;

public interface QuestionService {
	
Question create(Question que);

List<Question> getallQue();


Question getOne(Long Id);

List<Question> getQuestionsOfQuiz(Long quizId);

}
