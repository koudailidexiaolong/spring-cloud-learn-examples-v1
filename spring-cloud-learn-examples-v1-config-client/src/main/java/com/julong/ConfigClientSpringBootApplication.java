package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置中心客户端
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 
 */
@SpringBootApplication
//@RefreshScope   //用于从Config服务器加载配置属性值
public class ConfigClientSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientSpringBootApplication.class, args);
    }

}