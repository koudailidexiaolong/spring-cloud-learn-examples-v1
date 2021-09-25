package com.julong.action;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.julong.entity.UserDTO;

@RestController
public class IndexAction {

	private static final Logger logger = LoggerFactory.getLogger(IndexAction.class);
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private LoadBalancerClient ribbonLoadBalancerClient;
	
	/**
	 * 根据编号查询用户信息
	 * @param userId
	 * @return
	 * @author julong
	 * @date 2021年9月6日 下午2:22:31
	 * @desc
	 */
	@RequestMapping(value = "/template/user/{userId}", method = RequestMethod.GET)
	public String getUser(@PathVariable("userId") String userId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<UserDTO> entity = new HttpEntity<UserDTO>(headers);
		String result = restTemplate.exchange("http://spring-cloud-learn-examples-v1-ribbon-server/user/"+userId, HttpMethod.GET, entity, String.class).getBody();
		ServiceInstance serviceInstance =  this.ribbonLoadBalancerClient.choose("spring-cloud-learn-examples-v1-ribbon-server");
		logger.info("serviceInstance:{},host:{},port:{}，URI：{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort(),serviceInstance.getUri());
		return result;
	}
	
	@RequestMapping(value = "/template/user", method = RequestMethod.GET)
	public String selectUserList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<UserDTO> entity = new HttpEntity<UserDTO>(headers);
		String result =  restTemplate.exchange("http://spring-cloud-learn-examples-v1-ribbon-server/user/", HttpMethod.GET, entity, String.class).getBody();
		ServiceInstance serviceInstance =  this.ribbonLoadBalancerClient.choose("spring-cloud-learn-examples-v1-ribbon-server");
		logger.info("serviceInstance:{},host:{},port:{}，URI：{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort(),serviceInstance.getUri());
		return result;
	}


}
