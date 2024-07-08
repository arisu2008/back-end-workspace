package com.kh.arraypractice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	
	private Member[] mArr = new Member[3];
	public int count = 0;
	/*
	 * 아이디를 입력 받았는데 기존 멤버 배열에 아이디가 있는 경우
	 * "중복된 아이디입니다. 다시 입력해주세요." 출력 후
	 * 다시 아이디 입력부터 나올 수 있게 처리
	 * 
	 * 아이디 :
	 * 이름 :
	 * 비밀번호 :
	 * 이메일 :
	 * 성별(M/F) :
	 * 나이 :
	 * */
	
	public void insertMember(Member m) {
		mArr[count++] = new Member(m.getId(), m.getName(), m.getPwd()
								 , m.getEmail(), m.getGender(), m.getAge());
	}

	// 멤버 아이디 검색
	public int checkId(String id) {
		for(int i = 0; i < mArr.length; i++ ) {
			if(mArr[i]!=null && mArr[i].getId().equals(id)) {
				// 기존 멤버 배열에 아이디가 있는 경우
				return true;
			}
		}
		// 아이디가 없는 경우
		return -1;
	}
	
	public void updateMember(String id, String name, String email, String pwd) {
		// 멤버의 index 찾기!
		int index = checkId(id);
		mArr[index].setName(name);
		mArr[index].setEmail(email);
		mArr[index].setPwd(pwd);
		
	}
	// 멤버 조회
	public Member[] printAll() {
		Member[] mArr = mc.printAll();
		for(Member m : mArr) {
			if(m!=null) System.out.println(m);
		}
	}
}
