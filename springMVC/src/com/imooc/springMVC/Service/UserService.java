package com.imooc.springMVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.springMVC.DAO.UserDAO;
import com.imooc.springMVC.pojo.User;

@Service
public class UserService {
	@Autowired private UserDAO userDAO;
	
	public List<User> getAllUser(){
		return userDAO.getAllUser();
	}
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}
	public int addUser(User user) {
		return userDAO.addUser(user);
	}
	public int deleteUser(int id) {
		return userDAO.deleteUser(id);
	}
	public int updateUser(User user) {
		return userDAO.updateUser(user);
	}
}
