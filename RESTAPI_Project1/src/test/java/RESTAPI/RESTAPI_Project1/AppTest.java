//package RESTAPI.RESTAPI_Project1;
//
//import junit.framework.Test;
//import io.restassured.RestAssured.*;
//import org.json.simple.JSONObject;
//import io.restassured.response.Response;
//import io.restassured.RestAssured;
//import io.restassured.specification.RequestSpecification;
//
//public class AppTest 
//    
//{
//    Response response1 = null;
//	public static void main(String args[])
//	{
//	
//		RestAssured.baseURI="http://localhost:8085/rest";
//		RequestSpecification request = RestAssured.given();
//	//	given().
//		JSONObject requestParams = new JSONObject();
//		requestParams.put("username", "administrator");
//		requestParams.put("password", "test");
//		request.body(requestParams.toJSONString()).
//		when().
//		request.post("/1/session").
//	/*	
//		contentType("application/json").
//		body("{\"username\":\"" +"administrator" + "\",\"password\":\""+"test").
//	//	when().
//		post("http://localhost:8085/rest/auth/1/session").*/
//		then().
//		statusCode(200).extract().response(); 
//		
//		
//		
//	}
//}
