package com.nmet.nmet.model;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface empDAO {
	public List<empVO> selectAll();
}
