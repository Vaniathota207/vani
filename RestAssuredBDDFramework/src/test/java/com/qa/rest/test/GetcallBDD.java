package com.qa.rest.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetcallBDD {
	
	@Test
	public void test_numberofCircuitsFor2017_Season() {
		
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			statusCode(200).
			and().
			body("MRData.CircuitTable.Circuits", hasSize(20));
			
		

		
	}

}
