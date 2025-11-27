package com.transflower.tflassessment;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CandidateAnswerAPITest {
    static {
        RestAssured.baseURI = "http://localhost:5238/api/candidateanswer";
    }
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjEiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9lbWFpbGFkZHJlc3MiOiJyYXZpLnRhbWJhZGVAZXhhbXBsZS5jb20iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3JvbGUiOiJhZG1pbiIsImV4cCI6MTc2NDIzMzI3NywiaXNzIjoiQXNzZXNzbWVudEFQSSIsImF1ZCI6IkFzc2Vzc21lbnRBUEkifQ.Z2UUJw2NINzmkVdPz1pmCGBPOqRH6QUrlz61tRZ8xY4"; 
String smetoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjMiLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9lbWFpbGFkZHJlc3MiOiJuaXJqYWxhLm5haWtAZXhhbXBsZS5jb20iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3JvbGUiOlsic21lIiwic3R1ZGVudCJdLCJleHAiOjE3NjQyMjYwNjQsImlzcyI6IkFzc2Vzc21lbnRBUEkiLCJhdWQiOiJBc3Nlc3NtZW50QVBJIn0.mzrsQ2F5cRbphDbAnLHDajVQHkFFbBiCXNw4jzLqhsY";
    
    @Test
    public void InsertCandidateAnswers(){
        String requestBody="""      
        [
            {
                "CandidateId": 1,
                "TestQuestionId": 16,
                "AnswerKey": "B"
            }
            ]
                """;
        given()
        .header("Content-Type", "application/json")
        .body(requestBody)
        .when()
        .post("/assessmentanswers/candidates/17")
        .then()
        .body("message", equalTo("Candidate answers inserted successfully."))
        .body("status",equalTo(true));
    }

    @Test
    public void GetCandidateAnswers(){
        given()
        .when()
        .get("/assessmentanswers/candidates/1/testId/1")
        .then
        
    }
    
}
