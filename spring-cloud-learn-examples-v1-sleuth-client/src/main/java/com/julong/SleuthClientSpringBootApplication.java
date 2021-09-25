package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * 日志跟踪客户端启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 */
@SpringBootApplication
@EnableEurekaClient
public class SleuthClientSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthClientSpringBootApplication.class, args);
    }


}