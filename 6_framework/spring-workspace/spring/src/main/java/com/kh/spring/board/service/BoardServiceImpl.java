package com.kh.spring.board.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.spring.board.model.dao.BoardDao;
import com.kh.spring.board.model.vo.Board;
import com.kh.spring.board.model.vo.PageInfo;
import com.kh.spring.board.model.vo.Reply;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	//sqlSession, bDao 객체 DI
	private final SqlSessionTemplate sqlSession;
	private final BoardDao bDao;
	/*
	public BoardServiceImpl(SqlSessionTemplate sqlSession, BoardDao bDao) {
		this.sqlSession=sqlSession;
		this.bDao =bDao;
		
	}
*/
	
	@Override
	public int selectListCount() {
		return bDao.selectListCount(sqlSession);
	}

	@Override
	public ArrayList<Board> selectList(PageInfo pi) {
		return bDao.selectListCount(sqlSession, pi);
	}

	@Override
	public int insertBoard(Board b) {
		return bDao.insertBoard(sqlSession, b);
		
	}

	@Override
	public int increaseCount(int boardNo) {
		return bDao.increaseCount(sqlSession, boardNo);
	
	}

	@Override
	public Board selectBoard(int boardNo) {
		return bDao.selectBoard(sqlSession, boardNo);
	}

	@Override
	public int updateBoard(Board b) {
		return bDao.updateBoard(sqlSession, b);
	}

	@Override
	public int deletBoard(int boardNo) {
		return bDao.deletBoard( sqlSession,boardNo);
	}

	@Override
	public ArrayList<Reply> selectReplyList(int boardNo) {
		return bDao.selectReplyList(sqlSession,boardNo);
	}

	@Override
	public int insertReply(Reply r) {
		return bDao.insertReply(sqlSession,r);
	}
	
	@Override
	public ArrayList<Board> selectBoardTop5(){
		return bDao.selectBoardTop5(sqlSession);
	}
	
}
