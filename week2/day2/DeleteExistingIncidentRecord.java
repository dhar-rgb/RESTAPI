package week2.day2;

import io.restassured.RestAssured;

public class DeleteExistingIncidentRecord {

	public static void main(String[] args) {
		String url = "https://dev210461.service-now.com/api/now/table/incident/ef43c6d40a0a0b5700c77f9bf387afe3";
		RestAssured.given()
		.auth()
		.basic("admin","a9!nm=SdHFI0")
		.log()
		.all()
		.when()
		.delete(url)
		.then()
		.log()
		.all();

	}

}
