package com.julong.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {

	private static final Logger logger = LoggerFactory.getLogger(HelloAction.class);
	
	@RequestMapping("/")
	public String hello(){
		logger.info("【首页模块】-根据编号查询信息：{}");
		logger.debug("【首页模块】-根据编号查询信息：{}");
		logger.trace("【首页模块】-根据编号查询信息：{}");
		logger.error("【首页模块】-根据编号查询信息：{}");
		logger.warn("【首页模块】-根据编号查询信息：{}");
		return "hello,spring-boot!";
	}
}
