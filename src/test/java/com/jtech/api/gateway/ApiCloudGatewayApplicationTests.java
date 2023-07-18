package com.jtech.api.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ApiCloudGatewayApplicationTests {

	@Autowired
	private ApiCloudGatewayApplication apiCloudGatewayApplication;
	@Test
	void contextLoads() {
		assertThat(apiCloudGatewayApplication).isNotNull();
	}

}
