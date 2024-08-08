package com.kh.test;


import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(false) {
			System.out.println("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			
			if(str == "exit") {
				continue;
			} else {
				System.out.println(str.length + "글자 입니다.");
			}
		}
		
		  System.out.println("프로그램을 종료합니다.");
		  
	}

	
}
/*JDBC를 이용하여 자바와 데이터베이스를 연결하여 결과대로 구현하려 하는데 제대로 실행되지 않는다. 잘못된 부분을 [원인](20점)에 기술하고, 제대로 수정한 코드를 [조치내용](30점)에 기술하시오. (50점)
- DBMS : MySQL, 데이터베이스 : kh, 테이블 : employee, 컬럼명 : emp_id, emp_name 값 가지고 와서 구현 */

