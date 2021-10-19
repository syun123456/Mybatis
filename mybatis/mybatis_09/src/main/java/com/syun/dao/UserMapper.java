package com.syun.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.syun.pojo.User;

public interface UserMapper {
	
	User queryUserById(@Param("id") int id) ;
}