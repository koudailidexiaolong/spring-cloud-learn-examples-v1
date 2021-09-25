package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心服务端
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
@EnableConfigServer //启用配置中心
public class ConfigServerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerSpringBootApplication.class, args);
    }

}