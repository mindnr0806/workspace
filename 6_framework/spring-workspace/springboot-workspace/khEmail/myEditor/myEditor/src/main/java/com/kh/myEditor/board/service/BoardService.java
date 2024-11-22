package com.kh.myEditor.board.service;

import org.springframework.stereotype.Service;

import com.kh.myEditor.board.model.mapper.BoardMapper;
import com.kh.myEditor.board.model.vo.Board;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardMapper bMapper;
	/*
	 * lombok 미사용 시 
	 public BoardService(BoardMapper bMapper) {
	 	this.bMapper = bMapper;
	 }	 
	 */
	
	public int insertBoard(Board b) {
		return bMapper.insertBoard(b);
	}

}
