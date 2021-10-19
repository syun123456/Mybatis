package com.syun.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.syun.pojo.User;
import com.syun.utils.MybatisUtils;

public class UserMapperTest {
//	@Test
//	public void test() {
//		SqlSession sqlSession = MybatisUtils.getSqlSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = userMapper.queryUserById(2);
//		System.out.println(user);
//		
//		sqlSession.clearCache();//手動清理Cache
//		
//		User user2 = userMapper.queryUserById(2);
//		System.out.println(user2);
//		User user3 = userMapper.queryUserById(1);
//		System.out.println(user3);
//		
//		System.out.println(user == user2);
//		
//		sqlSession.close();
//	}
// 二級Cache測試，於UserMapper.xml有配置二級Cache則user == user2為true
	@Test
	public void test2() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		SqlSession sqlSession2 = MybatisUtils.getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
		
		User user = userMapper.queryUserById(2);
		System.out.println(user);
		sqlSession.close();
		
		User user2 = userMapper2.queryUserById(2);
		System.out.println(user2);
		
		
		System.out.println(user == user2);
		
		sqlSession2.close();
	}
	
//	@Test
//	public void test() {
//		SqlSession sqlSession = MybatisUtils.getSqlSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = userMapper.queryUserById(1);
//		System.out.println("test:::" + user);
//		
//		
//		sqlSession.close();
//		
//	}
//	
//	@Test
//	public void test2() {
//		SqlSession sqlSession = MybatisUtils.getSqlSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = userMapper.queryUserById(1);
//		System.out.println("test2:::" + user);
//		
//		
//		sqlSession.close();
//		
//	}
}

