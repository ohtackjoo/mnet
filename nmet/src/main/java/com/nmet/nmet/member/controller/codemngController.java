package com.nmet.nmet.member.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nmet.nmet.member.model.codemngVO;
import com.nmet.nmet.member.model.memberService;

@Controller
public class codemngController {
private static final Logger logger = LoggerFactory.getLogger(codemngController.class);
	
	@Autowired
	private memberService service; 

	@RequestMapping(value = "/member/codemng.do", method = RequestMethod.GET)
	public String codeMngG(Locale locale, Model model) {		
		logger.info("코드관리");
		List<codemngVO> list=service.selectCodeMng();
		model.addAttribute("list",list);
		return "/member/codemng";
	}
	@RequestMapping(value = "/member/codemng.do", method = RequestMethod.POST)
	public String codeMngP(Locale locale, Model model,HttpServletRequest req) {		
		String cDNO=req.getParameter("codeno");
		String cDLVL=req.getParameter("codelvl");
		String uPCD=req.getParameter("upcode");
		String cDNAME=req.getParameter("codename");
		String uSEYN=req.getParameter("useyn");
		if(uSEYN.equals("on")) {
			uSEYN="Y";
		}else {
			uSEYN="N";
		}
		String inorup=req.getParameter("inorup");
		codemngVO vo=new codemngVO();
		vo.setCDNO(cDNO);
		vo.setCDNAME(cDNAME);
		vo.setCDLVL(Integer.parseInt(cDLVL));
		vo.setUSEYN(uSEYN);
		vo.setUPCD(uPCD);
		vo.setINSUSER("admin");
		logger.info("vo={}",vo);
		logger.info("inorup={}",inorup);
		String msg="";
		String url="codemng.do";
		if(inorup.equals("in")) {
			logger.info("코드관리-추가");
			int cnt=service.insertCode(vo);
			if(cnt>0) {
				msg="코드가 추가 되었습니다.";
			}else {
				msg="코드가 추가 실패.";
			}
		}else if(inorup.equals("up")) {
			int cnt=service.updateCode(vo);
			if(cnt>0) {
				msg="코드가 수정 되었습니다.";
			}else {
				msg="코드가 수정 실패.";
			}
		}
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		return "messge";
	}
}
