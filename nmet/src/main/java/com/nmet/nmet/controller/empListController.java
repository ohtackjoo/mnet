package com.nmet.nmet.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nmet.nmet.model.empService;
import com.nmet.nmet.model.empVO;

@Controller
public class empListController {
	
	private static final Logger logger = LoggerFactory.getLogger(empListController.class);
	
	@Autowired
	private empService empService; 

	@RequestMapping(value = "/empList.do", method = RequestMethod.GET)
	public String empList(Locale locale, Model model) {		
		logger.info("글 목록");
		
		List<empVO> list=empService.selectAll();
		logger.info("글 목록 조회, 결과 list.size={}",
				list.size());
		
		model.addAttribute("alist", list);
		
		return "empList";	
	}

}
