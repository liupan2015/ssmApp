package com.ykai.ssm.dao;

import com.ykai.ssm.domain.User;

public interface UserDao {
	/***
	 * 
	 * @param userId
	 * @return User
	 */
	public User selectUserById(Integer userId);
}
