package com.julong.entity;

/**
 * 用户
 * @author julong
 * @date 2021年9月12日 下午2:13:19
 * @desc 
 */
public class UserDTO {

	/**
	 * 编号
	 * @author julong
	 * @date 2021年9月6日 下午1:42:42
	 */
	private String userId;
	
	/**
	 * 姓名
	 * @author julong
	 * @date 2021年9月6日 下午1:42:47
	 */
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + "]";
	}
	
	
	
}
