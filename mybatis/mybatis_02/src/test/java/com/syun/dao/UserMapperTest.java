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
	public void getUserList() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> userList = userMapper.getUserList();
		
		for(User user:userList) {
			System.out.println(user);
		}
		
		sqlSession.close();
	}

}

