package Generic;

import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builder_Api {

	public static RequestSpecification req_builder() throws IOException 
	{
		RequestSpecBuilder req_bui=new RequestSpecBuilder();
		RequestSpecification req = req_bui.setBaseUri(Fetch_properties.get_properties()).setContentType(ContentType.JSON).build();
		return req;
	}
	public static ResponseSpecification res_builder(int statuscode) 
	{
		ResponseSpecBuilder res_bui= new ResponseSpecBuilder();
		ResponseSpecification res = res_bui.expectContentType(ContentType.JSON).expectStatusCode(statuscode).build();
		return res;
	}
}
