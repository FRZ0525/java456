package com.java456.service.Impl;


import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.java456.dao.MemoFenLeiDao;
import com.java456.entity.MemoFenLei;
import com.java456.service.MemoFenLeiService;



@Service("memoFenLeiService")
public class MemoFenLeiServiceImpl implements MemoFenLeiService {
	
	@Resource
	private MemoFenLeiDao  memoFenLeiDao;
	
	public Integer add(MemoFenLei fenlei) {
		// TODO Auto-generated method stub
		return memoFenLeiDao.add(fenlei);
	}

	public Integer update(MemoFenLei fenlei) {
		// TODO Auto-generated method stub
		return memoFenLeiDao.update(fenlei);
	}

	public List<MemoFenLei> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return memoFenLeiDao.list(map);
	}

	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return memoFenLeiDao.getTotal(map);
	}

	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return memoFenLeiDao.delete(id);
	}
	
	public MemoFenLei findById(Integer id) {
		// TODO Auto-generated method stub
		return memoFenLeiDao.findById(id);
	}
	
}
