package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.Quiz;
import com.quiz.service.QuizService;

@RestController
public class QuizController {
	@Autowired
	private QuizService Quizserv;
	
	@GetMapping("/Quiz")
	public List<Quiz> getAllUser(){
		 return Quizserv.getAll();
	}


@GetMapping("/Quiz/{quizId}")
public Quiz findQuiz(@PathVariable("quizId") Long quizId) {
	  return Quizserv.findQuiz(quizId);
}

@PostMapping("/Quiz")
public Quiz CreateUser(@RequestBody Quiz quiz) {
	return Quizserv.Create(quiz);
}
}
