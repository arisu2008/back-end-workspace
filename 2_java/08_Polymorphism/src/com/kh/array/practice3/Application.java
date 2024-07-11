package com.kh.array.practice3;

import java.util.Scanner;

import com.kh.array.practice3.controller.MemberController;
import com.kh.array.practice3.moder.Member;
import com.kh.array.practice3.Application;

public class Application {

	Scanner sc = new Scanner(System.in);
	Member member = new Member();
	Book[] books = {new Book("밥을 지어요", true, 0),
					Book("오늘은 아무래도 덮밥", true, 0),
					Book("원피스 108", true, 0),
					Book("귀멸의 칼날 23", true, 0)
	}
	private int bookList;

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();
	}
	
	public void mainMenu() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이 : ");
		member.setName(name);
		int age = Integer.parseInt(sc.nextLine());
		member.setAge(age);
		
		while(true) {
		System.out.println("=====메뉴=====");
		System.out.println("1. 마이페이지 ");
		System.out.println("2. 도서 대여하기 ");
		System.out.println("3. 프로그램 종료하기 ");
		System.out.println("메뉴 번호 :  ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println(member);
	}
				if(number == 1) {
					System.out.println(member);
				} else if(number == 2) {
					System.out.println("1번 도서 : Book [title");
				}
				
				int select = Integer.parseInt(sc.nextLine());
					switch(select) {
					case 1:
						BookTitle();
						break;
					case 2:
						MenuNumber();
						break;
					case 3:
						printAll();
						break;
					case 4:				
						System.out.println("프로그램 종료");
						check = false;
						break;
						
						default:
							System.out.println("나이 제한으로 대여 불가능입니다.");
				
				
				System.out.println("메뉴 번호 :  ");
				System.out.println("대여할 도서 번호 선택 : ");
				
		}
	}
}

	public void BookTitle() {
		System.out.println("2. 도서 대여하기");
		String id = sc.nextLine();
		// 메뉴 번호2 일떄
		System.out.println("밥을 지어요,");
		String title1 = sc.nextLine(); 
		System.out.println("오늘은 아무래도 덮밥,");
		 String title2 = sc.nextLine(); 
		System.out.println("원피스 108,");
	 	 String title3 = sc.nextLine(); 
		System.out.println("귀멸의 칼날23,");
		 String title4 = sc.nextLine(); 
		 
		 mc.BookTitle(title1, title2, title3, title4);
		// 메뉴 번호 1 일때
		title1 = "밥을 지어요";
		title2 = "원피스 108";
		title3 = "";
		title4 = "";
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
	public void MenuNumber() {
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
