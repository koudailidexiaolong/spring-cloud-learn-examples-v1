package com.julong.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.julong.entity.UserDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 用户请求控制器类
 * @author julong
 * @date 2021年9月6日 下午1:40:34
 * @desc 
 */
@RestController
@Api(value="用户模块")
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
	@ApiOperation(value="根据ID查询用户数据",notes="用户模块") //标识模块信息和方法信息
	@ApiImplicitParam(name="userId",type="java.lang.String",value="用户ID",required=true) //标识参数信息
	public UserDTO getUser(@PathVariable("userId") String userId){
		UserDTO user = userMaps.get(userId);
		return user;
	}
	
	@RequestMapping(value="/user",method={RequestMethod.GET})
	@ApiOperation(value="查询用户所有数据",notes="用户模块")
	public Map<String,UserDTO> selectUserList(){
		return userMaps;
	}
	

}
