package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 声明式服务调用客户端服务
 * @author julong
 * @date 2021年9月25日 下午6:11:57
 * @desc 
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableFeignClients
public class FeignClientSpringBootApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FeignClientSpringBootApplication.class, args);
	}
	
}
