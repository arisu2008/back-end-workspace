package com.kh.practice2;

import java.util.Scanner;

import com.kh.practice2.controller.MemberController;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();
		
	}
	
	
	public void mainMenu() {
		boolean check = true;
		while(check) {
			System.out.println("마지막 위치에 곡 추가");
			System.out.println("첫 위치에 곡 추가");
			System.out.println("전체 곡 목록 출력");
			System.out.println("특정 곡 검색");
			System.out.println("특정 곡 삭제");
			System.out.println("특정 곡 수정");
			System.out.println("가수 명 내림차순 정렬");
			System.out.println("곡 명 오름차순 정렬");
			System.out.println("종료");
			System.out.println("메뉴 번호 입력 : ");
		} if(mc.count < 11) {
			
		} else {
			
		}
		System.out.println("마지막 위치에 곡 추가");
		System.out.println("첫 위치에 곡 추가");
		System.out.println("전체 곡 목록 출력");
		System.out.println("특정 곡 검색");
		System.out.println("특정 곡 삭제");
		System.out.println("특정 곡 수정");
		System.out.println("가수 명 내림차순 정렬");
		System.out.println("곡 명 오름차순 정렬");
		System.out.println("종료");
		System.out.println("메뉴 번호 입력 : ");
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		System.out.println("곡 명");
		System.out.println("가수 명 : ");
		System.out.println("추가 성공");
		

	

	}
}