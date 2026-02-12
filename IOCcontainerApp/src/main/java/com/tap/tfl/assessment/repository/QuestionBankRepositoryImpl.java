package com.tap.tfl.assessment.repository;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tfl.assessment.Entity.QuestionEntity;

public class QuestionBankRepositoryImpl implements QuestionBankRepository {
    
    @Override
    public List<QuestionEntity> getAllQuestions() {
        
        List<QuestionEntity> quesList=new ArrayList<>();
        try {
            ObjectMapper mapper=new ObjectMapper();

            // Serialization
            InputStream inputStream=getClass().getClassLoader().getResourceAsStream("data/QuestionBank.json");
            quesList=mapper.readValue(inputStream,new TypeReference<List<QuestionEntity>>(){
            });
        } catch ( Exception e) {
            System.out.println(e);
        }
        return quesList;
    }
}