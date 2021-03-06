package com.java456.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java456.dao.LinkDao;
import com.java456.dao.LunBoDao;
import com.java456.entity.LunBo;
import com.java456.service.LunBoService;



@Service("lunBoService")
public class LunBoServiceImpl implements LunBoService {

	@Resource
	private LunBoDao lunBoDao;
	
	public Integer add(LunBo lunbo) {
		// TODO Auto-generated method stub
		return lunBoDao.add(lunbo);
	}

	public Integer update(LunBo lunbo) {
		// TODO Auto-generated method stub
		return lunBoDao.update(lunbo);
	}

	public List<LunBo> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return lunBoDao.list(map);
	}

	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return lunBoDao.getTotal(map);
	}

	public LunBo findById(Integer id) {
		// TODO Auto-generated method stub
		return lunBoDao.findById(id);
	}

	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return lunBoDao.delete(id);
	}
	
	public List<LunBo> index_list() {
		// TODO Auto-generated method stub
		return lunBoDao.index_list();
	}

}
