package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务检查健康信息启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 * 获取程序健康指标
 * http://192.168.10.27:18080/health 
 * 
 * 
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ActuatorSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorSpringBootApplication.class, args);
    }

}