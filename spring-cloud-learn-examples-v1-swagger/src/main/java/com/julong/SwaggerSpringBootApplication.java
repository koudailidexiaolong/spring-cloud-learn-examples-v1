package com.julong;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc 
 */
@SpringBootApplication
@EnableSwagger2 //启用swagger 
public class SwaggerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerSpringBootApplication.class, args);
    }

    /**
     * swagger 配置
     * @return
     * @author julong
     * @date 2021年9月9日 下午3:20:06
     * @desc
     */
    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfo("swagger2 文档","文档测试","1.0.0","","","",""))
        		.select()
//        		.apis(RequestHandlerSelectors.basePackage("com.julong.action"))
        		.apis(RequestHandlerSelectors.any())
        		.build();
     }


    
}