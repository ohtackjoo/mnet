package com.nmet.nmet.member.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class memberServiceimpl implements memberService{
	@Autowired
	private memberDAO dao;

	@Override
	public memberVO checkIDandPASS(memberVO vo)  {
		return dao.checkIDandPASS(vo);
	}

	@Override
	public memberVO selectByID(String ID) {
		return dao.selectByID(ID);
	}

	@Override
	public int insertJoin(memberVO vo) {
		return dao.insertJoin(vo);
	}

	@Override
	public List<memberDetailVO> selectDetail() {
		return dao.selectDetail();
	}

	@Override
	public int insertDetail(memberDVO vo) {
		return dao.insertDetail(vo);
	}

	@Override
	public List<codemngVO> selectCodeMng() {
		return dao.selectCodeMng();
	}

	@Override
	public int updateCode(codemngVO vo) {
		return dao.updateCode(vo);
	}

	@Override
	public int insertCode(codemngVO vo) {
		return dao.insertCode(vo);
	}

	@Override
	public List<codemngVO> selectItem1() {
		return dao.selectItem1();
	}

	@Override
	public List<codemngVO> selectItem2(String code) {
		return dao.selectItem2(code);
	}

	@Override
	public List<itemVO> selectItem3(String code) {
		return dao.selectItem3(code);
	}

	@Override
	public int insertItem(itemVO vo) {
		return dao.insertItem(vo);
	}

	@Override
	public int updateItem(itemVO vo) {
		return dao.updateItem(vo);
	}

	@Override
	public List<codemngVO> selectItem4() {
		return dao.selectItem4();
	}

	@Override
	public List<codemngVO> selectItem5() {
		return dao.selectItem5();
	}

	@Override
	public List<itemVO> selectInItem() {
		return dao.selectInItem();
	}
	@Transactional
	@Override
	public int insertInItem(itemVO vo) {
		return dao.insertInItem(vo);
	}
	@Transactional
	@Override
	public int updateInItem(itemVO vo) {
		return dao.updateInItem(vo);
	}

	@Override
	public itemVO selectInItem2(String INSITEMLISTCD) {
		return dao.selectInItem2(INSITEMLISTCD);
	}

	@Override
	public itemVO selectInItem3(String ITEMCD) {
		return dao.selectInItem3(ITEMCD);
	}
	@Transactional
	@Override
	public int updateItem2(itemVO vo) {
		return dao.updateItem2(vo);
	}
	@Transactional
	@Override
	public int updateInItem2(itemVO vo) {
		return dao.updateInItem2(vo);
	}
}
