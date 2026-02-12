package com.tap.tfl.assessment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tfl.assessment.Entity.IOCcontainer;
import com.tap.tfl.assessment.Entity.QuestionEntity;
import com.tap.tfl.assessment.Service.QuestionBankService;
import com.tap.tfl.assessment.Service.QuestionBankServiceImpl;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/getAllQuestions")
public class QuestionBankController extends  HttpServlet {

private QuestionBankService questionbankservice;

@Override
public void init(){
    questionbankservice=IOCcontainer.getBean(QuestionBankService.class);
}

    @Override
    protected  void doGet(HttpServletRequest request,HttpServletResponse response) throws ServerException,IOException{
        PrintWriter out=response.getWriter();
        try{
            List<QuestionEntity> questions=questionbankservice.getAllQuestions();

            //Deserialization
            response.setContentType("application/json");
            response.encodeRedirectURL("UTF-8");
            ObjectMapper mapper=new ObjectMapper();
            mapper.writeValue(out,questions);
            
            // for(QuestionEntity question:questions){
            //     out.println(question);
            // }
        }
        catch(Exception e){
            out.println(e);
        }
    }
}