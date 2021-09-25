package com.julong.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.julong.entity.UserDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * 用户请求控制器类
 * @author julong
 * @date 2021年9月6日 下午1:40:34
 * @desc 
 */
@RestController
public class UserAction {
	private static Map<String,UserDTO> userMaps = new HashMap<String,UserDTO>();
	static{
		for (int i = 0; i < 10; i++) {
			UserDTO user = new UserDTO();
			user.setUserId(i+"");
			user.setUserName("测试数据"+i);
			userMaps.put(i+"", user);
		}
	}
	
	/**
	 * 查询单个用户
	 * @param userId
	 * @return
	 * @author julong
	 * @date 2021年9月6日 下午2:31:05
	 * @desc
	 */
	@RequestMapping(value="/user/{userId}",method={RequestMethod.GET})
	@HystrixCommand
	public UserDTO getUser(@PathVariable("userId") String userId){
		UserDTO user = userMaps.get(userId);
		return user;
	}
	
	@RequestMapping(value="/user",method={RequestMethod.GET})
	public Map<String,UserDTO> selectUserList(){
		return userMaps;
	}
	
	@RequestMapping(value="/test",method={RequestMethod.GET})
	@HystrixCommand(fallbackMethod = "fallback_hello", commandProperties = {
			   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
	})
	public String selectTestHystrix() throws InterruptedException{
		Thread.sleep(2000);
		return "hello hystrix";
	}
	
	@SuppressWarnings("unused")
	private String fallback_hello() {
		return "Request fails. It takes long time to response";
	}


}
