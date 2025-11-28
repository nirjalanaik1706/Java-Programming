package com.transflower.tflassessment;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class QuestionBankAPITest {
    static{
        RestAssured.baseURI="http://localhost:5238/api/questionbank";
    }
    @Test
    public void GetAllQuestions(){
        given()
        .when()
        .get("/api/questionbank/questions")
        .then()
        .statusCode(200)
        .body("[0].id",equalTo(1))
        .body("[0].title",equalTo("Which keyword is used to inherit a class in Java?"));
    }
    
    
}
