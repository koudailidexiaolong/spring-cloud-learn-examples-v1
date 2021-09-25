package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
@EnableHystrix //启用熔断服务配置 也可以使用 @EnableCircuitBreaker
@EnableEurekaClient
public class HystrixClientSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixClientSpringBootApplication.class, args);
    }

}