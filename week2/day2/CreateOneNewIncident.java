package week2.day2;

import io.restassured.RestAssured;

public class CreateOneNewIncident {

	public static void main(String[] args) {
		String url = "https://dev210461.service-now.com/api/now/table/incident";
		String RequestPayload = """
			{
					  "caller_id": "413a4d35eb32010045e1a5115206fe6b",
					  "short_description": "Short Description for RAS",
					  "description": "RAS"
					}
					""";
		RestAssured.given()
		.auth()
		.basic("admin","a9!nm=SdHFI0")
		.header("Content-Type", "application/json")
		.log()
		.all()
		.when()
		.body(RequestPayload)
		.post(url)
		.then()
		.log()
		.all();
		

	}

}
