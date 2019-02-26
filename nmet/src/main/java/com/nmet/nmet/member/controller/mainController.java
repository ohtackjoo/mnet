package com.nmet.nmet.member.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {
	private static final Logger logger = LoggerFactory.getLogger(mainController.class);

	@RequestMapping(value = "/member/main.do", method = RequestMethod.GET)
	public String empListG(Locale locale, Model model) {		
		logger.info("main페이지");

		return "member/main";	
	}
}
