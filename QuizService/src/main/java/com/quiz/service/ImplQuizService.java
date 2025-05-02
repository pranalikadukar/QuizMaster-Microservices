package com.quiz.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quiz.Quiz;
import com.quiz.repository.QuizRepository;


@Service
@Transactional
public class ImplQuizService implements QuizService{
	@Autowired
	private QuizRepository Quizrepo;
	
	@Autowired
	private QuestionClient QueClient;

	
	@Override
	public Quiz Create(Quiz quiz) {
		// TODO Auto-generated method stub
		return Quizrepo.save(quiz);
	}


	@Override
	public List<Quiz> getAll() {
		// TODO Auto-generated method stub
		List<Quiz> quizzes =Quizrepo.findAll();
		
		
		List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
			quiz.setQuestion(QueClient.getQuestionsOfQuiz(quiz.getQuizId()));
			return quiz;
		}).collect(Collectors.toList());
		
         return newQuizList;
		}


	@Override
	public Quiz findQuiz(Long Id) {
		// TODO Auto-generated method stub
		Quiz quiz = Quizrepo.findById(Id).orElseThrow(()-> new RuntimeException("Quiz not found"));
		
		quiz.setQuestion(QueClient.getQuestionsOfQuiz(quiz.getQuizId()));
		
		return quiz;
	}
}
