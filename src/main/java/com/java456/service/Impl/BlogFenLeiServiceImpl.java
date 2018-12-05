package com.java456.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java456.dao.BlogFenLeiDao;
import com.java456.dao.DownFenLeiDao;
import com.java456.entity.BlogFenLei;
import com.java456.service.BlogFenLeiService;



@Service("blogFenLeiService")
public class BlogFenLeiServiceImpl implements BlogFenLeiService {


	@Resource
	private BlogFenLeiDao blogFenLeiDao;

	public Integer add(BlogFenLei blogFenLei) {
		// TODO Auto-generated method stub
		return blogFenLeiDao.add(blogFenLei);
	}

	public Integer update(BlogFenLei blogFenLei) {
		// TODO Auto-generated method stub
		return blogFenLeiDao.update(blogFenLei);
	}

	public List<BlogFenLei> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogFenLeiDao.list(map);
	}

	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogFenLeiDao.getTotal(map);
	}

	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return blogFenLeiDao.delete(id);
	}

	public BlogFenLei findById(Integer id) {
		// TODO Auto-generated method stub
		return blogFenLeiDao.findById(id);
	}

}
