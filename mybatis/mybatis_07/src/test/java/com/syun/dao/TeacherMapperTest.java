package com.syun.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.syun.pojo.Student;
import com.syun.pojo.Teacher;
import com.syun.utils.MybatisUtils;

public class TeacherMapperTest {

	@Test
	public void getTeacher() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
		Teacher teacher = teacherMapper.getTeacher(1);
		System.out.println(teacher);
		
		sqlSession.close();
		
	}
	
	@Test
	public void getTeacher2() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
		Teacher teacher = teacherMapper.getTeacher2(1);
		System.out.println(teacher);
		
		sqlSession.close();
		
	}
	
	
}

