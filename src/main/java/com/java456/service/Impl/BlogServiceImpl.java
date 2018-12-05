package com.java456.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java456.dao.BlogDao;
import com.java456.dao.BlogFenLeiDao;
import com.java456.entity.Blog;
import com.java456.service.BlogService;


@Service("blogService")
public class BlogServiceImpl implements BlogService {
	

	@Resource
	private BlogDao blogDao;
	
	public Integer add(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.add(blog);
	}

	public Integer update(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.update(blog);
	}
	
	public List<Blog> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogDao.list(map);
	}

	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogDao.getTotal(map);
	}

	public Blog findById(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.findById(id);
	}
	
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.delete(id);
	}
	
	public List<Blog> list2(Map<String, Object> map) {
		return blogDao.list2(map);
	}

}
