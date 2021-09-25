package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.internal.EnableZipkinServer;


/**
 * 日志跟踪启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 */
@SpringBootApplication
@EnableZipkinServer
public class SleuthServerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServerSpringBootApplication.class, args);
    }

}