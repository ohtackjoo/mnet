package com.nmet.nmet.member.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface memberService {
	public memberVO checkIDandPASS(memberVO vo);
	public memberVO selectByID(String ID);
	public int insertJoin(memberVO vo);
	public List<memberDetailVO> selectDetail();
	public int insertDetail(memberDVO vo);
	public List<codemngVO> selectCodeMng();
	public int insertCode(codemngVO vo);
	public int updateCode(codemngVO vo);
	public List<codemngVO> selectItem1();
	public List<codemngVO> selectItem2(String code);
	public List<itemVO> selectItem3(String code);
	public int insertItem(itemVO vo);
	public int updateItem(itemVO vo);
	public List<codemngVO> selectItem4();
	public List<codemngVO> selectItem5();
	public List<itemVO> selectInItem();
	public int insertInItem(itemVO vo);
	public int updateInItem(itemVO vo);
	public itemVO selectInItem2(String INSITEMLISTCD);
	public itemVO selectInItem3(String ITEMCD);
	public int updateItem2(itemVO vo);
	public int updateInItem2(itemVO vo);
}
