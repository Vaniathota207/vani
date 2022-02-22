package com.qa.rest.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;


public class hamcrestExample {
	public String endpoint = "https://restful-booker.herokuapp.com/booking/1";
	 
    @Test
    public void stringAssertions() {
        RestAssured.given().contentType(ContentType.JSON)
                   .when().get(endpoint)
                   .then().body("firstname",equalTo("Mark"));
 
        RestAssured.given().contentType(ContentType.JSON)
                   .when().get(endpoint)
                   .then().body("firstname",startsWith("M"));
 
        RestAssured.given().contentType(ContentType.JSON)
                   .when().get(endpoint)
                   .then().body("firstname",endsWith("k"));
 
       
 
 
    }
}


