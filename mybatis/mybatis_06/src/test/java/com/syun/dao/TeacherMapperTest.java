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
		Teacher teacher = teacherMapper.getTeacher();
		
		System.out.println(teacher);
		
		sqlSession.close();
		
	}
	
	@Test
	public void getStudent() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> studentList = studentMapper.getStudent();
		for(Student student:studentList) {
			System.out.println(student);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void getStudent2() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> studentList = studentMapper.getStudent2();
		for(Student student:studentList) {
			System.out.println(student);
		}
		
		sqlSession.close();
	}
}

