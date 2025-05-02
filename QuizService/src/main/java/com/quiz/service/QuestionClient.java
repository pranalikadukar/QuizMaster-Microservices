package com.quiz.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.Question;

//@FeignClient(url="http://localhost:8082" , value="Question-Client")
@FeignClient(name = "QuestionService")
public interface QuestionClient {
	
	@GetMapping("/Question/quiz/{quizId}")
	List<Question> getQuestionsOfQuiz(@PathVariable("quizId") Long quizId) ;

}
