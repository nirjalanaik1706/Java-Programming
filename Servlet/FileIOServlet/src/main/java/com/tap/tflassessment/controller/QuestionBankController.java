package com.tap.tflassessment.controller;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/api/getAllQuestions")
public class QuestionBankController extends  HttpServlet {

    @Override
    protected  void doGet(HttpServletRequest request,HttpServletResponse response) throws ServerException,IOException{
        PrintWriter out=response.getWriter()
    }

    
}
