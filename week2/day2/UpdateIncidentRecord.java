package week2.day2;

import io.restassured.RestAssured;

public class UpdateIncidentRecord {

	public static void main(String[] args) {
		String url = "https://dev210461.service-now.com/api/now/table/incident/ef43c6d40a0a0b5700c77f9bf387afe3";
		String UpdatePayload = """
				{
  "short_description":"second Update using patch method to change description using oauth Chaininig request",
  "description":"patch"
						}""";
			RestAssured.given()
			.auth()
			.basic("admin","a9!nm=SdHFI0")
			.header("Content-Type", "application/json")
			.log()
			.all()
			.when()
			.body(UpdatePayload)
			.put(url)
			.then()
			.log()
			.all();
	}

}
