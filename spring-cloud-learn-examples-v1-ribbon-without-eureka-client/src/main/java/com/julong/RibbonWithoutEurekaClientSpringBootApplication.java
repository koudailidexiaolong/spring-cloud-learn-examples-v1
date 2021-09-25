package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RibbonWithoutEurekaClientSpringBootApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RibbonWithoutEurekaClientSpringBootApplication.class, args);
	}
	
	@Bean
	@LoadBalanced //轮巡的方式
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
