package com.syun.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.syun.pojo.User;

public interface UserMapper {
	
	@Select("select * from mybatis_user")
	List<User> getUsers();
	
	//method存在多個參數，要加上@param
	@Select("select * from mybatis_user where id = #{id}")
	User getUserById(@Param("id") int id);
	
	@Insert("insert into mybatis_user (id,name,pwd) values(#{id},#{name},#{password})")
	int addUser(User user);
}