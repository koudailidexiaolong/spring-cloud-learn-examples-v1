package com.julong.entity;

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


	/**
	 * 编号  @author julong  @date 2021年9月6日 下午1:42:42
	 * @return userId
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * 编号  @author julong  @date 2021年9月6日 下午1:42:42
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 姓名  @author julong  @date 2021年9月6日 下午1:42:47
	 * @return userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * 姓名  @author julong  @date 2021年9月6日 下午1:42:47
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("UserDTO{");
		sb.append("userId='").append(userId).append('\'');
		sb.append(", userName='").append(userName).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
