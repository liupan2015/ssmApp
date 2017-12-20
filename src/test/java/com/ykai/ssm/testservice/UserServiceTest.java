package com.ykai.ssm.testservice;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ykai.ssm.domain.User;
import com.ykai.ssm.service.UserService;
import com.ykai.ssm.test.SpringTestCase;

public class UserServiceTest extends SpringTestCase{
	
	private final static Logger log = LoggerFactory.getLogger(UserServiceTest.class);
	
	@Autowired  
    private UserService userService;
	
	@Test  
    public void selectUserByIdTest(){  
		String id="11";
        User user = userService.selectUserById(id);  
        log.info("{},{}",user.getUserName(),user.getUserPassword());
    }  
}
