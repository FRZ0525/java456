package com.java456.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java456.dao.ConfigDao;
import com.java456.dao.DownFenLeiDao;
import com.java456.entity.DownFenLei;
import com.java456.service.DownFenLeiService;



@Service("downFenLeiService")
public class DownFenLeiServiceImpl implements DownFenLeiService {
	

	@Resource
	private DownFenLeiDao downFenLeiDao;
	
	
	public Integer add(DownFenLei downFenLei) {
		// TODO Auto-generated method stub
		return downFenLeiDao.add(downFenLei);
	}

	public Integer update(DownFenLei downFenLei) {
		// TODO Auto-generated method stub
		return downFenLeiDao.update(downFenLei);
	}

	public List<DownFenLei> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return downFenLeiDao.list(map);
	}

	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return downFenLeiDao.getTotal(map);
	}
	
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return downFenLeiDao.delete(id);
	}
	
	public DownFenLei findById(Integer id) {
		// TODO Auto-generated method stub
		return downFenLeiDao.findById(id);
	}

}
