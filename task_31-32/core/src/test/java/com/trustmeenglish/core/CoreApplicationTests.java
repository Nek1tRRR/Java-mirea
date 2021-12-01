package com.trustmeenglish.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
class CoreApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplicationTests.class,args);

	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder().build();
	}

}
