package com.ykai.ssm.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ykai.ssm.dao.UserDao;
import com.ykai.ssm.domain.User;
import com.ykai.ssm.service.UserService;
import com.ykai.ssm.util.StringUtil;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User selectUserById(String userId) {
		if (StringUtil.isNotEmpty(userId)) {
			Integer IuserId=Integer.parseInt(userId);
			return userDao.selectUserById(IuserId);
		}
		return null;
	}

}
