package com.syun.dao;

import java.util.List;
import java.util.Map;

import com.syun.pojo.User;

public interface UserMapper {
	List<User> getUserList();
	
	User getUserById(int id);
	
	int addUser(User user);
	
	int updateUser(User user);
	
	int deleteUser(int id);
	
}