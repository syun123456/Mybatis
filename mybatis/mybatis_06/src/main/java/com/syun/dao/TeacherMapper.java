package com.syun.dao;

import org.apache.ibatis.annotations.Select;

import com.syun.pojo.Teacher;

public interface TeacherMapper {
	@Select("select * from teacher")
	Teacher getTeacher();
}
