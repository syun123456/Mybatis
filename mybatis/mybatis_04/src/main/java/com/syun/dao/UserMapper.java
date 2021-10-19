package com.syun.dao;

import java.util.List;
import java.util.Map;

import com.syun.pojo.User;

public interface UserMapper {
	User getUserById(int id);
	
	List<User> getUserByLimit(Map<String, Integer> map);
}