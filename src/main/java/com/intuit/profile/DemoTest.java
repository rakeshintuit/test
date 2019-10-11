package com.intuit.profile;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import org.hamcrest.Matchers;

public class DemoTest {

    @Test
    public void demoTest(){
        Response response = get("http://localhost:8091/getemployee");
        System.out.println(response.asString());
        Assert.assertTrue(response.getStatusCode() == 200);
    }
}
