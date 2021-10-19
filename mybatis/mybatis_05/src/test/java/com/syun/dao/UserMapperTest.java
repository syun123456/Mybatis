package com.syun.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.syun.pojo.User;
import com.syun.utils.MybatisUtils;

public class UserMapperTest {
	
	@Test
	public void getUsers() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> users = userMapper.getUsers();
		for(User user:users) {
			System.out.println(user);
		}
		
		
		sqlSession.close();
	}
	
	@Test
	public void getUserById() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.getUserById(3);
		System.out.println(user);
		
		sqlSession.close();
		
	}
	
//	@Test
//	public void addUser() {
//		SqlSession sqlSession = MybatisUtils.getSqlSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		int res = userMapper.addUser(new User(4,"syun","qwertyu"));
//		
//		sqlSession.close();
//		
//	}
}

