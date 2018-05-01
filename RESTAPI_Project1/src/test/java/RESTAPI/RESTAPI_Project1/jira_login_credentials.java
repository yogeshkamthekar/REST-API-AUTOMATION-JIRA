package RESTAPI.RESTAPI_Project1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.*;
import java.util.Properties;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class jira_login_credentials 
    
{
    
    static Response res;
    @Test
	public static void postwithcredentials()
	{
        RestAssured.baseURI="http://localhost:8085/rest";
         
        res=given().
		contentType("application/json").
		body("{\"usename\":\"administrator\",\"password\":\"test\"}").
		when().
		post("/1/session").
		then().
		statusCode(200).extract().response(); 
		
		
		
	}
}
