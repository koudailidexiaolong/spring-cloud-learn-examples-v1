package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 数据库脚本版本管理执行sql语句
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
public class FlywaySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlywaySpringBootApplication.class, args);
    }

}