package com.tap.tfl.assessment.repository;

import java.util.List;

import com.tap.tfl.assessment.Entity.QuestionEntity;

public interface QuestionBankRepository {
    public List<QuestionEntity> getAllQuestions();
}
