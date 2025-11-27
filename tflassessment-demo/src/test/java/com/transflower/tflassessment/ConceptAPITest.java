package com.transflower.tflassessment;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class ConceptAPITest {
    
    static{
        RestAssured.baseURI="https://localhost:5238/api/Concepts";
    }
    @Test
    public void UpdateConcept(){
        given()
        .header("Content-Type","application/json")
        .when()
        .put("/10/questions/64")
        .then()
        .statusCode(200)
        .body(equalTo("true"));
    }
    
}
