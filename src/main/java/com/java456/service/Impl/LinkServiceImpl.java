package com.java456.service.Impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.java456.dao.ConfigDao;
import com.java456.dao.LinkDao;
import com.java456.entity.Link;
import com.java456.service.LinkService;


@Service("linkService")
public class LinkServiceImpl implements LinkService {

	@Resource
	private LinkDao linkDao;

	public List<Link> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return linkDao.list(map);
	}

	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return linkDao.getTotal(map);
	}


	public Integer add(Link link) {
		// TODO Auto-generated method stub
		int i = linkDao.add(link);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		List<Link> linkList = linkDao.list(map );
		//刷新缓存  友情 链接
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
		ServletContext servletContext = webApplicationContext.getServletContext();
		servletContext.setAttribute("linkList", linkList);

		return i;
	}

	public Integer update(Link link) {
		// TODO Auto-generated method stub
		int i =  linkDao.update(link);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		List<Link> linkList = linkDao.list(map );
		//刷新缓存  友情 链接
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
		ServletContext servletContext = webApplicationContext.getServletContext();
		servletContext.setAttribute("linkList", linkList);

		return i;
	}


	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		int i =  linkDao.delete(id);


		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		List<Link> linkList = linkDao.list(map );
		//刷新缓存  友情 链接
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
		ServletContext servletContext = webApplicationContext.getServletContext();
		servletContext.setAttribute("linkList", linkList);

		return i;

	}

	public Link findById(Integer id) {
		// TODO Auto-generated method stub
		return linkDao.findById(id);
	}

}
