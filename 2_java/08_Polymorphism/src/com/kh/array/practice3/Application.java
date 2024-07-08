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
				
			}
		}	
	}		
			public int mainMenu() {
				System.out.println("1. 마이페이지 ");
				System.out.println("2. 도서 대여하기 ");
				System.out.println("3. 프로그램 종료하기 ");
				System.out.println("메뉴 번호 :  ");
				System.out.println("대여할 도서 번호 선택 : ");
				return 0;
				
			}
				
			
			
			public void BookTitle() {
				
				
		
				int menuNumber = 0;
				if (menuNumber == 2) {
					
				} else if (bookList == 1) {
					System.out.println();
					
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

	
