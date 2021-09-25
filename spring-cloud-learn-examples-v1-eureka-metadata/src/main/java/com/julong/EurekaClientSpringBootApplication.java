package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 元数据启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientSpringBootApplication.class, args);
    }

}