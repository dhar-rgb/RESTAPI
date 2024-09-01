package week2.day2;

import io.restassured.RestAssured;

public class GetAllIncidentRecords {

	public static void main(String[] args) {
		String url = "https://dev210461.service-now.com/api/now/table/incident";
		RestAssured.given()
		.auth()
		.basic("admin","a9!nm=SdHFI0")
		.log()
		.all()
		.when()
		.get(url)
		.then()
		.log()
		.all();
		

	}

}
