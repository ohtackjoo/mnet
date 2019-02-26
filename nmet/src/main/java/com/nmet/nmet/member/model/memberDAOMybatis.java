package com.nmet.nmet.member.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.nmet.nmet.member.controller.loginController;


@Repository
public class memberDAOMybatis implements memberDAO{
	private static final Logger logger = LoggerFactory.getLogger(loginController.class);

	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace="config.mybatis.mapper.oracle.userinfo.";
	
	public memberVO checkIDandPASS(memberVO vo) {
		logger.info("vo={}",vo);
		memberVO Cvo=sqlSession.selectOne(namespace+"checkIDandPASS",vo);
		return Cvo;
	}
	public memberVO selectByID(String ID) {
		logger.info("ID2={}",ID);
		memberVO vo=sqlSession.selectOne(namespace+"selectByID",ID);
		return vo;
	}
	public int insertJoin(memberVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.insert(namespace+"insertJoin",vo);
		return cnt;
	}
	public List<memberDetailVO> selectDetail() {
		List<memberDetailVO> list=sqlSession.selectList(namespace+"selectDetail");
		logger.info("list={}",list);
		return list;
	}
	public int insertDetail(memberDVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.insert(namespace+"insertdetail",vo);
		return cnt;
	}
	public List<codemngVO> selectCodeMng() {
		List<codemngVO> list=sqlSession.selectList(namespace+"selectCodeMng");
		logger.info("list={}",list);
		return list;
	}
	public int insertCode(codemngVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.insert(namespace+"insertcode",vo);
		return cnt;
	}
	public int updateCode(codemngVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.update(namespace+"updateCode",vo);
		return cnt;
	}
	public List<codemngVO> selectItem1() {
		List<codemngVO> list=sqlSession.selectList(namespace+"selectItem1");
		logger.info("list={}",list);
		return list;
	}
	public List<codemngVO> selectItem2(String code) {
		List<codemngVO> list=sqlSession.selectList(namespace+"selectItem2",code);
		logger.info("list={}",list);
		return list;
	}
	public List<itemVO> selectItem3(String code) {
		List<itemVO> list=sqlSession.selectList(namespace+"selectItem3",code);
		logger.info("list={}",list);
		return list;
	}
	public int insertItem(itemVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.insert(namespace+"insertItem",vo);
		return cnt;
	}
	public int updateItem(itemVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.update(namespace+"updateItem",vo);
		return cnt;
	}
	public List<codemngVO> selectItem4() {
		List<codemngVO> list=sqlSession.selectList(namespace+"selectItem4");
		logger.info("list={}",list);
		return list;
	}
	public List<codemngVO> selectItem5() {
		List<codemngVO> list=sqlSession.selectList(namespace+"selectItem5");
		logger.info("list={}",list);
		return list;
	}
	public List<itemVO> selectInItem() {
		List<itemVO> list=sqlSession.selectList(namespace+"selectInItem");
		logger.info("list={}",list);
		return list;
	}
	public int insertInItem(itemVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.insert(namespace+"insertInItem",vo);
		return cnt;
	}
	public int updateInItem(itemVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.update(namespace+"updateInItem",vo);
		return cnt;
	}
	public itemVO selectInItem2(String INSITEMLISTCD) {
		itemVO vo=sqlSession.selectOne(namespace+"selectInItem2",INSITEMLISTCD);
		logger.info("vo={}",vo);
		return vo;
	}
	public itemVO selectInItem3(String ITEMCD) {
		itemVO vo=sqlSession.selectOne(namespace+"selectInItem3",ITEMCD);
		logger.info("vo={}",vo);
		return vo;
	}
	public int updateItem2(itemVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.update(namespace+"updateItem2",vo);
		return cnt;
	}
	public int updateInItem2(itemVO vo) {
		logger.info("vo={}",vo);
		int cnt=sqlSession.update(namespace+"updateInItem2",vo);
		return cnt;
	}
	
}
