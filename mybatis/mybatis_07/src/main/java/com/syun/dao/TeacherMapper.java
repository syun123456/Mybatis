package com.syun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.syun.pojo.Student;
import com.syun.pojo.Teacher;

public interface TeacherMapper {
	Teacher getTeacher(@Param("tid") int id);
	
	Teacher getTeacher2(@Param("tid") int id);
}
