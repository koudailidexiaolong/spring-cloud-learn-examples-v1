package com.julong;


import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * 启用ssl https 访问方式
 * @author julong
 * @date 2021年9月5日 下午7:12:30
 * @desc
 */
@SpringBootApplication
public class SSLSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSLSpringBootApplication.class, args);
    }

    /**
     * 配置tomcat 可以使用 https 访问也可以配置http访问
     * @param
     * @return org.springframework.boot.context.embedded.EmbeddedServletContainerFactory
     * @author julong
     * @date 2021年09月17日 22:16:21
     * @desc
     */
    @Bean
    public EmbeddedServletContainerFactory containerFactory(){
        TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = new TomcatEmbeddedServletContainerFactory();
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);
        tomcatEmbeddedServletContainerFactory.addAdditionalTomcatConnectors(connector);
        return tomcatEmbeddedServletContainerFactory;
    }
}