package com.ykai.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ykai.ssm.domain.User;
import com.ykai.ssm.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/index")
	public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index"); 
        User user = userService.selectUserById("11"); 
        mav.addObject("user", user); 
        return mav; 
    }    
}
