package com.kh.spring.board.service;

import java.util.ArrayList;

import com.kh.spring.board.model.vo.Board;
import com.kh.spring.board.model.vo.PageInfo;
import com.kh.spring.board.model.vo.Reply;

public interface BoardService {
	/*	게시판 목록 조회 (+ 페이징 처리)*/
	int selectListCount();
	ArrayList<Board> selectList(PageInfo pi/* 페이지 관련 데이터 잔달받을 예정*/);

	/* 게시들 작성 --> C (insert) */
	int insertBoard(Board b);
	
	/*게시글 상세 조회 --> R(select) + U (update) */
	int increaseCount(int boardNo);		//조회수 증가
	Board selectBoard(int boardNo);
	
	/* 게시글 수정 --> U (update) */
	int updateBoard(Board b);
	
	/*게시글 삭제 --> U (update) */
	int deletBoard(int boardNo);
	
	/*댓글 목록 조회 --> (ajax), R (select) */
	ArrayList<Reply/* 댓글 관련 객체 */> selectReplyList(int boardNo);
	
	/* 댓글 등록(작성) --> (ajax), C(insert)*/
	int insertReply(Reply r);


	/* 게시글 top5 조회 */
	ArrayList<Board> selectBoardTop5();
	
}