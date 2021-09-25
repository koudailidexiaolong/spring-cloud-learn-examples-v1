package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:20
 * @desc 
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SimpleSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootApplication.class, args);
    }

}