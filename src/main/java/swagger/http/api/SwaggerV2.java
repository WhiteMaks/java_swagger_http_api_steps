package swagger.http.api;

import base.http.api.BaseHttpApi;
import base.http.api.RestResponse;

public class SwaggerV2 extends BaseHttpApi {
	private final String host;

	private final static String V2 = "/v2";
	private final static String SWAGGER_JSON = V2 + "/swagger.json";

	public SwaggerV2(String host) {
		this.host = host;
	}

	public RestResponse getSwaggerJson() {
		var url = host.concat(SWAGGER_JSON);
		return sendGet(url);
	}

}
