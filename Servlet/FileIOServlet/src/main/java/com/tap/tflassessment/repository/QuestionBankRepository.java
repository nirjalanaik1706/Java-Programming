
package com.tap.tflassessment.repository;
import java.util.List;

import com.tap.tflassessment.model.QuestionEntity;

public interface  QuestionBankRepository {
    
    public List<QuestionEntity> getAllQuestions();
}
