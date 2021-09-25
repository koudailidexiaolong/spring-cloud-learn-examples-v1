package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * 启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
@EnableAdminServer //启用admin管理平台配置
public class AdminServerUISpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerUISpringBootApplication.class, args);
    }

}