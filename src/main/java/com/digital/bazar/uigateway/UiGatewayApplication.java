package com.digital.bazar.uigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@Configuration
public class UiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiGatewayApplication.class, args);
	}

}

