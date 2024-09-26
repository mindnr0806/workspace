package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		// 전달 받은 객체 (Lottery l)를 HashSet(lottery)에 추가 후 결과인 boolean 반환
		return lottery.add(l);		// 중복된 데이터인 경우 Set에 추가하지 않고 false 반환
	}
	
	public boolean deleteObject(Lottery l) {
		// 전달 받은 객체 (Lottery l)를 HashSet(lottery)에서 삭제
		boolean result = lottery.remove(l);
		
		// 당첨자 목록(HashSet win) 중에도 삭제된 대상이 존재할 수 있으니
		//  삭제 결과(lottery에서 삭제 후 결과)인 boolean 값과 win 객체가 null이 아닐때만
		if (result && win != null) {
			// win 객체에서도 해당 대상을 삭제
			win.remove(l);
		}
		
		return result;
	}
	
	public HashSet winObject() {
		System.out.println();
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		if(lottery.size() < 4) {
			return null;
		}
		
		// 랜덤으로 뽑기 위해 lottery(HashSet)를 ArrayList에 담고
		//  * HashSet ---> ArrayList
		ArrayList<Lottery> lotteryList = new ArrayList<>(lottery);
		//lotteryList.addAll(lottery);
		
		// 인덱스를 이용해 win에 당첨자 저장
		//	당첨자는 4명(단, 추첨자 수는 4명이상이어야 함)
		//  당첨자 목록에 삭제된 추첨 대상자가 있다면 삭제된 사람의 자리만 새로운 추첨자로 채움
		while(win.size() < 4) {
			// 랜덤값 --> 추첨자의 인덱스 (0 ~ lottery.size()-1)
			//		Math.random() * (최대값 - 최소값 + 1) + 최소값
			int random = (int)(Math.random() * lottery.size());
			win.add( lotteryList.get(random) );
		}
		
		return win;		
	}
	
	public TreeSet sortedWinObject() {
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는 정렬 기준을 가지고
		// 정렬된 결과를 반환
		//  * TreeSet 생성자에게 정렬 기준을 정의한 SortedLottery 객체의 인스턴스 전달
		TreeSet<Lottery> sortedWin = new TreeSet<>( new SortedLottery() );
		sortedWin.addAll(win);
		
		return sortedWin;
		
		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에 당첨 대상 확인을 꼭 먼저 해야함
	}
	
	public boolean searchWinner(Lottery l) {
		// 전달 받은 객체 (Lottery l)를 win 객체에서 찾고
		// 찾은 결과인 boolean 값 반환
		return win.contains(l);	// set참조변수.contains(객체) : 해당 Set 내에 객체가 포함(저장)되어 있는 지 여부 확인
	}
}
