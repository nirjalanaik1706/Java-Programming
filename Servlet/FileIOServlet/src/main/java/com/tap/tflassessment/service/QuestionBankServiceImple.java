package com.tap.tflassessment.service;

import java.util.List;

import com.tap.tflassessment.model.QuestionEntity;
import com.tap.tflassessment.repository.QuestionBankRepositoryImpl;

public class QuestionBankServiceImple implements QuestionBankService {

    private QuestionBankRepositoryImpl repo=new QuestionBankRepositoryImpl();

    public QuestionBankServiceImple(){

    }

    @Override
    public List<QuestionEntity> getAllSubjects(){
        return repo.getAllQuestions();
    }
    
}
