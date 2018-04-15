package RESTAPI.RESTAPI_Project1;

//import org.junit.Test;
//import org.junit.Before;
/*import io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;*/
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;

public class jira_login_credentials 
    
{
    

    @Test
	public static void postwithcredentials()
	{
        RestAssured.baseURI="http://localhost:8085/rest";
        Response response1 = given().
		contentType("application/json").
		body("{\"usename\":\"administrator\",\"password\":\"test\"}").
		when().
		post("/1/session").
		then().
		statusCode(200).extract().response(); 
		
		
		
	}
}
