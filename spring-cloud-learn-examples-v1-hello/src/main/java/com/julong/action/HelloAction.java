package com.julong.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {

	@RequestMapping("/")
	public String hello(){
		return "hello,spring-boot!";
	}
}
