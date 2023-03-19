package qaautomation.maret2023;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import qaautomation.maret2023.schemalist.SchemaDashboard;
import qaautomation.maret2023.schemalist.SchemaNegative;
import qaautomation.maret2023.utils.DataUtility;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


public class APITestAfterRefactor extends BaseAPITest{
	String token;
	String baseUrl = "https://api-staging-builder.engineer.ai";
	
	@Test 
	public void userAPI() {
		RestAssured.baseURI = baseUrl;
		Response responseUser = given().spec(loginJsonSpec).when().get("/user");
		assertEquals(responseUser.getStatusCode(),200);
	}
	
	@Test
	public void dashboardAPIUsingScehmaInCode() {
		RestAssured.baseURI = baseUrl;
		SchemaDashboard schema = new SchemaDashboard();
		Response responseDashboard = given().spec(loginJsonSpec).when().get(DataUtility.getDataFromExcel("path", "dashboard"));
		responseDashboard.then().assertThat().body(matchesJsonSchema(schema.dashboardSchema()));
		assertEquals(responseDashboard.getStatusCode(),200);
	}
	
	@Test
	public void dashboardAPIWithoutToken() {
		RestAssured.baseURI = baseUrl;
		SchemaNegative schema = new SchemaNegative();
		Response responseDashboard = given().spec(commonJsonSpec).when().get(DataUtility.getDataFromExcel("path", "dashboard"));
		responseDashboard.then().assertThat().body(matchesJsonSchema(schema.schemaNegative()));
		assertEquals(responseDashboard.getStatusCode(),401);
	}
}