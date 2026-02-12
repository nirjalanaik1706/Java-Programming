package com.tap.tfl.assessment.Service;


import java.util.List;

import com.tap.tfl.assessment.Entity.QuestionEntity;
import com.tap.tfl.assessment.repository.QuestionBankRepositoryImpl;

public class QuestionBankServiceImpl implements QuestionBankService {

    private QuestionBankRepositoryImpl repo=new QuestionBankRepositoryImpl();

    public QuestionBankServiceImpl(){

    }

    @Override
    public List<QuestionEntity> getAllQuestions(){
        return repo.getAllQuestions();
    }
    
}
