package com.tap.tflassessment.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tflassessment.model.QuestionEntity;
import com.tap.tflassessment.service.QuestionBankServiceImple;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/getAllQuestions")
public class QuestionBankServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {

        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            QuestionBankServiceImple srv = new QuestionBankServiceImple();
            List<QuestionEntity> questions = srv.getAllSubjects();

            //Deserialization
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(out, questions);

            // for(QuestionEntity question:questions){
            //     out.println(question);
            // }
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            out.println(e.getMessage());
        }
    }

    

}
