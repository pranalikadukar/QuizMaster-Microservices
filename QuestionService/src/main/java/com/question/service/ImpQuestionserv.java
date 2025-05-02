package com.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.question.Question;
import com.question.repository.QuestionRepository;
@Service
@Transactional
public class ImpQuestionserv implements QuestionService{
	
	@Autowired
	private QuestionRepository queRepo;

	@Override
	public Question create(Question que) {
		// TODO Auto-generated method stub
		return queRepo.save(que);
	}

	@Override
	public List<Question> getallQue() {
		// TODO Auto-generated method stub
		return queRepo.findAll();
	}

	@Override
	public Question getOne(Long Id) {
		// TODO Auto-generated method stub
		return queRepo.findById(Id).orElseThrow(()  ->  new RuntimeException("Question not Found"));
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return queRepo.findByQuizId(quizId);
	}

	

}
