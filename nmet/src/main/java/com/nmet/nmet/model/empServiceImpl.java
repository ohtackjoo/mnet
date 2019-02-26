package com.nmet.nmet.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empServiceImpl implements empService{
	@Autowired
	private empDAO empDao;

	@Override
	public List<empVO> selectAll() {
		return empDao.selectAll();
	}
	
}
