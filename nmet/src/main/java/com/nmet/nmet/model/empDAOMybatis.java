package com.nmet.nmet.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class empDAOMybatis implements empDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="config.mybatis.mapper.oracle.emp.";
	
	public List<empVO> selectAll() {
		List<empVO> list
		=sqlSession.selectList(namespace+"selectAll");	
	return list;
	}

}
