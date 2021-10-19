package com.syun.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.syun.pojo.User;
import com.syun.utils.MybatisUtils;

public class UserMapperTest {
	
	static Logger logger = Logger.getLogger(UserMapperTest.class);
	
	@Test
	public void getUserList() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.getUserById(1);
		
		System.out.println(user);
		
		sqlSession.close();
	}
	
	@Test
	public void log4jTest() {
		logger.info("info message");
		logger.debug("debug message");
		logger.error("error message");
	}
	
	@Test
	public void getUserByLimit() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", 1);
		map.put("end", 3);
		List<User> userList = userMapper.getUserByLimit(map);
		
		for(User user:userList) {
			System.out.println(user);
		}
		
		sqlSession.close();
	}
}

