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
	
	@Test
	public void getUserById() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.getUserById(1);
		System.out.println(user);
		
		sqlSession.close();
	}
	
	//@Test
	public void addUser() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int res = userMapper.addUser(new User(4, "Chen", "qweasdzxc"));
		if(res>0) {
			System.out.println("Success");
		}
		
		// 增加、刪除、修改在Mybatis中一定要提交事務
		sqlSession.commit();
		
		sqlSession.close();
	}
	
	@Test
	public void updateUser() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.updateUser(new User(4, "chen", "123456789"));
		
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void deleteUser() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.deleteUser(4);
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void addUser2() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("UserId", 5);
		map.put("UserPassword", "asdasdasd");
		
		userMapper.addUser2(map);
		
		sqlSession.commit();
		sqlSession.close();
	}
}

