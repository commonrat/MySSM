package com.imooc.springMVC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.springMVC.Service.UserService;
import com.imooc.springMVC.pojo.User;

@RestController
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	@RequestMapping("/user")
	public List<User> getUser() {
		
		return userService.getAllUser();
	}
	
}
