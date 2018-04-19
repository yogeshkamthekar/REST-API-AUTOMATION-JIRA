import io.restassured.Restassured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.Jsonpath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.Restassured.given;

import java.io.Fileinputstream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.IOException;
import java.IO.Inputstream;
import java.lang.*;
import java.util.Properties;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.avenstack.extentreports.Status;

public class Postrequest
{

Properties prop =new Properties();
ExtentReports extent;
ExtentTest test,test1,test2;
Response res;
static String responseasstringpostdelete;
static String place_id;

@BeforeTest
public void before() throws IOException
{
Fileinputstream fis = new FileinputStream("D:\\path of file");
prop.load(fis);
extent = ExtentManager.GetExtent();
}

@Test(priority=0)
{
public void postrequest1()
{

try{
 RestAssured.baseURI=prop.getProperty("HOST");
 test = extent.createTest("Google_Rest_API","post request with valid test");
 
 res = given().
 queryParam("key",prop.getProperty("KEY")).
 
 body(payload.postpayload()).
 when().
 post(resources.post()).
 then().assertThat().statusCode(200).and().
 contentType(ContentType.JSON).and().
 
 body("status",equalTo("OK")).and().
 body("scope",equalTo("APP")).
 extract().response();
 }

catch (Exception e)
{
 test.log(Status.FAIL,"failed in POST request with value ' +e);
}

}
