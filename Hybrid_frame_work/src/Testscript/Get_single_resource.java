package Testscript;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import Generic.Spec_builder_Api;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Get_single_resource {

	public static void main(String[] args) throws IOException {
   
     Response res1 = given().spec(Spec_builder_Api.req_builder()).get("/api/unknown/2").then().spec(Spec_builder_Api.res_builder(200)).extract().response();
     System.out.println(res1.asString());

	}

}
