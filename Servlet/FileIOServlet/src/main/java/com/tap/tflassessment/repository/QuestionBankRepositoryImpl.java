package com.tap.tflassessment.repository;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.tap.tflassessment.model.QuestionEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class QuestionBankRepositoryImpl implements QuestionBankRepository {
    
    @Override
    public List<QuestionEntity> getAllQuestions() {
        List<QuestionEntity> quesList=new ArrayList<>();
        try {
            ObjectMapper mapper=new ObjectMapper();

            InputStream inputStream=getClass().getClassLoader().getResourceAsStream("data/Questions.json");
            quesList=mapper.readValue(inputStream,new TypeReference<List<QuestionEntity>>(){
            });
        } catch ( Exception e) {
            System.out.println(e);
        }
        return quesList;
    }
}