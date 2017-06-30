package com.fannie.tests;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.empty;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;



public class MessageTest {


@Test
 public void googleTest() {
		given().
		// there can be conditions 
			when()
		// there can be conditions 
			.get("http://google.com").then().statusCode(2009);
	
	
		
		
		
}

}