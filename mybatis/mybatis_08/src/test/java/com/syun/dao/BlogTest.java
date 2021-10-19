package com.syun.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.syun.pojo.Blog;
import com.syun.utils.IdUtils;
import com.syun.utils.MybatisUtils;

public class BlogTest {
	@Test
	public void queryBlogIf() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
		
		Map map = new HashMap();
		//map.put("title","Java");
		//map.put("author","syun");
		List<Blog> blogs = blogMapper.queryBlogIf(map);
		
		for(Blog blog:blogs) {
			System.out.println(blog);
		}
		
		sqlSession.close();
	}
	
//	@Test
//	public void queryBlogChoose() {
//		SqlSession sqlSession = MybatisUtils.getSqlSession();
//		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
//		
//		Map map = new HashMap();
//		map.put("title","Html");
//		map.put("author","syun");
//		map.put("view",9999);
//		List<Blog> blogs = blogMapper.queryBlogChoose(map);
//		
//		for(Blog blog:blogs) {
//			System.out.println(blog);
//		}
//		
//		sqlSession.close();
//	}
	
//	@Test
//	public void updateBlog() {
//		SqlSession sqlSession = MybatisUtils.getSqlSession();
//		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
//		
//		Map map = new HashMap();
//		map.put("title","Html");
//		map.put("author","aaaaaa");
//		map.put("id","27b2756319484dbfa0191af3e1d0afe7");
//		blogMapper.updateBlog(map);
//		
//		
//		sqlSession.close();
//	}
}

