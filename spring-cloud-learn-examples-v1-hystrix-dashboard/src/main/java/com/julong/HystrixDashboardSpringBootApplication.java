package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard //启用hystrix图形界面工具
public class HystrixDashboardSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardSpringBootApplication.class, args);
    }

}