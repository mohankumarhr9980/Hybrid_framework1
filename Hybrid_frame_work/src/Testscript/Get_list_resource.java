package Testscript;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import Generic.Spec_builder_Api;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Get_list_resource {

	public static void main(String[] args) throws IOException {
		Response res1 = given().spec(Spec_builder_Api.req_builder()).get("/api/unknown").then()
				.spec(Spec_builder_Api.res_builder(200)).extract().response();
		System.out.println(res1.prettyPrint());
			}

}
