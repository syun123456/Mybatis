package com.syun.dao;

import java.util.List;
import java.util.Map;

import com.syun.pojo.Blog;

public interface BlogMapper {
	int addBlog(Blog blog);
	
	List<Blog> queryBlogIf(Map map);
	
	List<Blog> queryBlogChoose(Map map);
	
	int updateBlog(Map map);
}
