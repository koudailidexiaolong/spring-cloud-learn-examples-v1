package com.julong.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //加入此注解 调用refesh 刷新配置
public class HelloAction {

	@Value("${welcome.message}")
	private String welcomeText;



	@RequestMapping("/")
	public String hello(){
		return "hello,spring-boot! spring-cloud-learn-examples-v1-config-client";
	}

	@RequestMapping("/index")
	public String index(){
		return welcomeText;
	}
}
