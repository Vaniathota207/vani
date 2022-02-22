package com.qa.rest.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FirstTest {
	@Test
	void testLogging() {
		RestAssured.given()
		.when()
		.log()
		.all()
		.get("https://chercher.tech/sample/api/product/read");
		
	}

}
