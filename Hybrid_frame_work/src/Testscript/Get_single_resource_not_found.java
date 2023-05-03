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

public class Get_single_resource_not_found {

	public static void main(String[] args) throws IOException {

  /*  RequestSpecBuilder a1 = new RequestSpecBuilder();
    RequestSpecification req = a1.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
    ResponseSpecBuilder b1 = new ResponseSpecBuilder();
    ResponseSpecification res = b1.expectContentType(ContentType.JSON).expectStatusCode(404).build();*/
    Response res1 = given().spec(Spec_builder_Api.req_builder()).get("/api/unknown/23").then().spec(Spec_builder_Api.res_builder(404)).extract().response();
    System.out.println(res1.asString());

	}

}
