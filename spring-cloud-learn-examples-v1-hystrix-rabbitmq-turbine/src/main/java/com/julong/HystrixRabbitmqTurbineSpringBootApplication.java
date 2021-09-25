package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * 启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 访问方式  192.168.10.27:18761/turbine.stream
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream //启用集中管理服务治理熔断服务
public class HystrixRabbitmqTurbineSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixRabbitmqTurbineSpringBootApplication.class, args);
    }

}