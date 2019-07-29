package com.imooc.springMVC.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.springMVC.pojo.User;

public interface UserDAO {
	
	public List<User> getAllUser();
	public User getUserById(@Param("id") int id);
	public int addUser(User user) ;
	public int deleteUser(@Param("id") int id) ;
	public int updateUser(User user) ;
	
	
}
