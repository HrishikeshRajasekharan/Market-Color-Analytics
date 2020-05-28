package com.restapi.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
public class RestConsumerApplication {
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}			
	
	public static void main(String[] args) {
		SpringApplication.run(RestConsumerApplication.class, args);
	}
	
	
}
