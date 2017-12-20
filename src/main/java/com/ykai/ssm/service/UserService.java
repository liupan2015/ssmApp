package com.ykai.ssm.service;


import com.ykai.ssm.domain.User;

public interface UserService {
	User selectUserById(String userId);
}
