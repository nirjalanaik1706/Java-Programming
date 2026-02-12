package com.tap.tfl.assessment.Entity;

import java.util.HashMap;
import java.util.Map;

import com.tap.tfl.assessment.Service.QuestionBankService;
import com.tap.tfl.assessment.Service.QuestionBankServiceImpl;

public class IOCcontainer {
    private static Map<Class<?>,Object>beans=new HashMap<>();
    static{
        beans.put(QuestionBankService.class,new QuestionBankServiceImpl());
    }
    public static<T> T getBean(Class<T> clazz){
        return clazz.cast(beans.get(clazz));
    }
}
