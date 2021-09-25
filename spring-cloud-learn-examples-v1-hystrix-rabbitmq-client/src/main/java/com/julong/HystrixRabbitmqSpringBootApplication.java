package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //启用熔断服务配置 也可以使用 @EnableCircuitBreaker
public class HystrixRabbitmqSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixRabbitmqSpringBootApplication.class, args);
    }

}