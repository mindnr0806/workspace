package com.kh.phone.controller;

import com.kh.phone.model.dao.PhoneBookDAO;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneBookController {
	PhoneBookDAO pbDao = new PhoneBookDAO();
	PhoneBook[] pList;
	
	public PhoneBookController() {
		pList = pbDao.searchPhone();
	}

	public void addPhone(PhoneBook pb) {
		for(int i=0; i<pList.length; i++) {
			if(pList[i] == null) {
				pList[i] = pb;
				break;
			}
		}
		
		pbDao.savePhone(pList);
	}
	
	public PhoneBook[] searchPhone() {
		return pbDao.searchPhone();
	}
}






