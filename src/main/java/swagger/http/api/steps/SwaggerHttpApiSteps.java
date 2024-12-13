package swagger.http.api.steps;

import base.http.api.RestResponse;
import base.http.api.StatusCode;
import swagger.http.api.SwaggerV2;

public class SwaggerHttpApiSteps {
	private final SwaggerV2 swaggerV2;

	public SwaggerHttpApiSteps(String host) {
		swaggerV2 = new SwaggerV2(host);
	}

	public swagger.http.api.models.v2.swagger.json.get.Response getSwaggerJsonV2() {
		var response = swaggerV2.getSwaggerJson();
		checkStatusCode(response, StatusCode.OK);
		return response.getBodyByClass(swagger.http.api.models.v2.swagger.json.get.Response.class);
	}

	private void checkStatusCode(RestResponse response, StatusCode expectedStatusCode) {
		if (response.getStatus() != expectedStatusCode) {
			throw new RuntimeException("Unexpected status code: " + response.getStatus());
		}
	}
}
