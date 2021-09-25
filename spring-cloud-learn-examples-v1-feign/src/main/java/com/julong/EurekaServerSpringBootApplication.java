package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 声明式服务调用集成eureka服务启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSpringBootApplication.class, args);
    }

}