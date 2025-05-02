package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question.Question;
import com.question.service.QuestionService;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService queServ;
	
	
	@PostMapping("/Question")
	public Question create(@RequestBody Question que) {
		return queServ.create(que);
	}
	
	@GetMapping("/Question")
	public List<Question> getallQue(){
		
		return queServ.getallQue();
    }

	@GetMapping("/Question/{Id}")
	public Question getone(@PathVariable("Id") Long Id) {
		return queServ.getOne(Id);
	}
	
	@GetMapping("/Question/quiz/{quizId}")
	public List<Question> getQuestionsOfQuiz(@PathVariable("quizId") Long quizId){
		 System.out.println("Received quizId = " + quizId);
		return queServ.getQuestionsOfQuiz(quizId);
	}
}
