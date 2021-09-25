package com.julong.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.julong.service.UserServiceFeignClient;

@RestController
public class IndexAction {

	private static final Logger logger = LoggerFactory.getLogger(IndexAction.class);

	@Autowired
	private UserServiceFeignClient userServiceFeignClientImpl;
	
	@Autowired
	private LoadBalancerClient loadBalancerClientImpl;
	
	
	/**
	 * 根据编号查询用户信息
	 * @param userId
	 * @return
	 * @author julong
	 * @date 2021年9月6日 下午2:22:31
	 * @desc
	 */
	@LoadBalanced //客户端负载方法
	@RequestMapping(value = "/template/user/{userId}", method = RequestMethod.GET)
	public String getUser(@PathVariable("userId") String userId) {
		String result = this.userServiceFeignClientImpl.getUser(userId);
		ServiceInstance serviceInstance =  this.loadBalancerClientImpl.choose("spring-cloud-learn-examples-v1-feign-server");
		logger.info("serviceInstance:{},host:{},port:{}，URI：{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort(),serviceInstance.getUri());
		return result;
	}
	


}
