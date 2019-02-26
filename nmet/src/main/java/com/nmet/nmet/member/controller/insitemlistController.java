package com.nmet.nmet.member.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nmet.nmet.member.model.codemngVO;
import com.nmet.nmet.member.model.itemVO;
import com.nmet.nmet.member.model.memberService;

@Controller
public class insitemlistController {
private static final Logger logger = LoggerFactory.getLogger(insitemlistController.class);
	
	@Autowired
	private memberService service; 

	@RequestMapping(value = "/member/insitemlist.do", method = RequestMethod.GET)
	public String insitemlistG(Locale locale, Model model,HttpServletRequest req) {		
		logger.info("입고관리");
		List<codemngVO> list=service.selectItem1();
		List<itemVO> list2=service.selectInItem();		
		logger.info("list={}",list);
		logger.info("list2={}",list2);
		model.addAttribute("clist",list);
		model.addAttribute("ilist",list2);
		String userparam="";
		if(req.getParameter("userparam")!=null) {
			userparam=req.getParameter("userparam");
		}
		model.addAttribute("userparam", userparam);
		String userparam1="";
		if(req.getParameter("userparam1")!=null) {
			userparam1=req.getParameter("userparam1");
		}
		model.addAttribute("userparam1", userparam1);
		return "/member/insitemlist";	
	}
	@RequestMapping(value = "/member/insitemlist.do", method = RequestMethod.POST)
	public String insitemlistP(Locale locale, Model model,HttpServletRequest request) {		
		logger.info("입고 처리");
		String ITEMCD=request.getParameter("ITEMCD");
		String ITEMNAME=request.getParameter("ITEMNAME");
		String MADENAME=request.getParameter("MADENAME");
		String ITEMUNITNAME=request.getParameter("ITEMUNITNAME");
		String STOCKAMT=request.getParameter("STOCKAMT");
		String INSITEMLISTCD=request.getParameter("INSITEMLISTCD");
		String codeSel1=request.getParameter("codeSel1");
		String ajaxsel1=request.getParameter("ajaxsel1");
		logger.info("codeSel1={}",codeSel1);
		logger.info("ajaxsel1={}",ajaxsel1);
		int stockamt=Integer.parseInt(STOCKAMT);
		String inorup=request.getParameter("inorup");
		itemVO vo= new itemVO();
		vo.setITEMCD(ITEMCD);
		vo.setITEMNAME(ITEMNAME);
		vo.setMADENAME(MADENAME);
		vo.setITEMUNITNAME(ITEMUNITNAME);
		vo.setSTOCKAMT(STOCKAMT);
		vo.setINSITEMLISTCD(INSITEMLISTCD);
		int cnt=0;
		String msg="";
		String url="";
		if(inorup.equals("in")) {
			logger.info("입고 처리 입력");
			itemVO vo3=service.selectInItem3(ITEMCD);
			cnt=service.insertInItem(vo);
			stockamt=Integer.parseInt(vo3.getSTOCKAMT())+stockamt;
			vo.setSTOCKAMT(Integer.toString(stockamt));
			cnt+=service.updateInItem(vo);
			if(cnt>1) {
				msg="입고처리 되었습니다.";
				url="insitemlist.do";
			}else {
				msg="입고처리실패.";
				url="insitemlist.do";
			}
		}else if(inorup.equals("up")){
			logger.info("입고 처리 수정");
			logger.info("vo={}",vo);
			itemVO vo2=service.selectInItem2(INSITEMLISTCD);
			itemVO vo3=service.selectInItem3(ITEMCD);
			vo.setINSAMT(Integer.toString(stockamt));
			stockamt=Integer.parseInt(vo3.getSTOCKAMT())-Integer.parseInt(vo2.getINSAMT())+stockamt;
			vo.setSTOCKAMT(Integer.toString(stockamt));

			cnt=service.updateItem2(vo);
			cnt+=service.updateInItem2(vo);
			if(cnt>1) {
				msg="입고수정처리 되었습니다.";
				url="insitemlist.do";
			}else {
				msg="입고수정처리실패.";
				url="insitemlist.do";
			}
		}
		
	    model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		model.addAttribute("userparam",codeSel1);
		model.addAttribute("userparam1",ajaxsel1);
		
		return "messge";
	}
}
