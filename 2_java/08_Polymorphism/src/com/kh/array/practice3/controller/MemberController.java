package com.kh.array.practice3.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	private Member[] mArr = new Member[3];
	
	public void updateMember(String id, String title1, String title2, String title3, String title4) {
		// 멤버의 index 찾기!
		int index = BookTitle(id);
		mArr[index].setName(title1);
		mArr[index].setName(title2);
		mArr[index].setEmail(title3);
		mArr[index].setPwd(title4);
	
}

	public int BookTitle(String id, String title2, String title3, String title4) {
		// TODO Auto-generated method stub
		return 0;
	}

	}

	