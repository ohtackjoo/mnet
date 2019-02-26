package com.nmet.nmet.model;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface empService {
	public List<empVO> selectAll();
}
