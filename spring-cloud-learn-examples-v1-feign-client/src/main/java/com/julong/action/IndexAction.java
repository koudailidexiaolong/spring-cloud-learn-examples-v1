package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.julong.service.UserServiceFeignClient;

@RestController
public class IndexAction {


	@Autowired
	private UserServiceFeignClient userServiceFeignClientImpl;
	
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
		String result = this.userServiceFeignClientImpl.getUser(userId);
		return result;
	}
	


}
