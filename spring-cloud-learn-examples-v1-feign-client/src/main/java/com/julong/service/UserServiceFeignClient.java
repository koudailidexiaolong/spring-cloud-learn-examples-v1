package com.julong.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="spring-cloud-learn-examples-v1-feign-server")
public interface UserServiceFeignClient {

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public abstract String getUser(@PathVariable("userId") String userId);
}
