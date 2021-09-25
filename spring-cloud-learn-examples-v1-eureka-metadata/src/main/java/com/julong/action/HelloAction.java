package com.julong.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloAction {

	/**
	 * 服务发现客户端
	 * @author julong
	 * @date 2021年9月12日 下午2:11:36
	 */
	@Autowired
	private DiscoveryClient discoveryClient;
	
	
	
	
	@RequestMapping("/")
	public String hello(){
		return "hello,spring-boot!";
	}
	
	@RequestMapping("/user-instance")
	public List<ServiceInstance> showApplicationInformation(){
		return this.discoveryClient.getInstances("spring-cloud-learn-examples-v1-eureka-metadata");
	}
	
	
}
