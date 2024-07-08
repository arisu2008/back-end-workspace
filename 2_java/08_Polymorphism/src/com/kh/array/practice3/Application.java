package com.kh.array.practice3;

import java.util.Scanner;

import com.kh.array.practice3.controller.MemberController;
import com.kh.array.practice3.moder.Member;
import com.kh.array.practice3.Application;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	private Member viewMember = new Member();
	private int bookList;

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();
	}
	
	public int mainMenu() {
				boolean check = true;
				while(true) {
					int select = app.mainMenu();
					switch(select) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:				
						check = false;
						break;
						
						default:
							System.out.println("나이 제한으로 대여 불가능입니다.");
				
				System.out.println("1. 마이페이지 ");
				System.out.println("2. 도서 대여하기 ");
				System.out.println("3. 프로그램 종료하기 ");
				System.out.println("메뉴 번호 :  ");
				System.out.println("대여할 도서 번호 선택 : ");
				return 0;
				
				
			}

	public void BookTitle() {
		// 메뉴 번호2 일떄
		title1 = "밥을 지어요";
		title2 = "오늘은 아무래도 덮밥";
		title3 = "원피스 108";
		title4 = "귀멸의 칼날23";
		// 메뉴 번호 1 일때
		title1 = "밥을 지어요";
		title2 = "원피스 108";
		title = "";
		title = "";
		int menuNumber = 0;
		if (menuNumber == 2) {

		} else if (bookList == 1) {
			System.out.println("title1", + coupon +, accessAge);

		} else if (bookList == 2) {
			System.out.println("title2", + coupon +, accessAge)
		} else if (bookList == 3) {
			System.out.println("title3", + coupon +, accessAge)
		} else if (bookList == 4) {
			System.out.println("title4", + coupon +, accessAge)
		}

		// 메뉴번호 2
		System.out.println("1번 도서 :");
		System.out.println("2번 도서 :");
		System.out.println("3번 도서 :");
		System.out.println("4번 도서 :");
		System.out.println("대여할 도서 번호 선택 : ");

		// 메뉴번호 1
		System.out.println("1번 도서 :");
		System.out.println("2번 도서 :");
		System.out.println("3번 도서 :");
		System.out.println("4번 도서 :");
		System.out.println("대여할 도서 번호 선택 : ");

	}

	public void printAll() {

	}

}
