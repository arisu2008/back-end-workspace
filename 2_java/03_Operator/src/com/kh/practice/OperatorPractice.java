package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		OperatorPractice O = new OperatorPractice();
//	  O.method1();
//	  O.method2();
//	  O.method3();
//	  O.method4();
//	  O.method5();
	  O.method6();
	  O.method7();
	}

	//모든 사람이 연필을 골고루 나눠가지려고 한다. 인원 수와 연필 개수를 입력 받고 
	//1인당 동일하게 나눠가진 연필 개수와 나눠주고 남은 연필의 개수를 출력하세요.
	public void method1() {
		
		System.out.println("인원수");
		int H = sc.nextInt();
		System.out.println("연필수");
		int P = sc.nextInt();
		
		int Z = P - H;
		sc.nextLine();
				
		System.out.println("1인당");
		System.out.println("연필수1개\n" + "남은연필수" + Z + "개");
		
		

	}
	
	//입력 받은 숫자를 산술 연산자만 사용해서 십의 자리 이하는 버리는 코드를 작성하세요.
	//만약 432이라면 400, 111이라면 100이 출력됩니다.
	public void method2() {
		
		System.out.println();
		int num1 = sc.nextInt();
		System.out.println();
		int num2 = sc.nextInt();
		
	}

	//3개의 수를 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	public void method3() {
		System.out.println();
		int num1 = sc.nextInt();
		System.out.println();
		int num2 = sc.nextInt();
		System.out.println();
		int num3 = sc.nextInt();
		
		boolean result = num1==num2==num3;
		

	}

	//입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "짝수가 아니다"를 출력하세요.
	public void method4() {
		System.out.println("짝수를 입력하시오");
		int D = sc.nextInt();		
		System.out.println("홀수를 입력하시오");
		int S = sc.nextInt();
		
		String result = D % 2 == 0 ? "짝수이면" : "짝수다";
		
		System.out.println(result);
		
		
	}

	//주민번호(-포함)를 입력받아 남자인지 여자인지 구분하여 출력하세요
	public void method5() {
		System.out.println("주민번호를 입력하시오(-포함)");
		int namecard = sc.nextInt();
		
	}

	//나이를 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
	public void method6() {
		System.out.println("나이를 입력하시오");
		int age = sc.nextInt();
		String result = age <= 13 ? "어린이" : 19 =< age > 13 "청소년" : age > 19 "성인";
		System.out.println(result);
		
	}

	//사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아
	//필요한 바구니의 수를 출력하세요
	public void method7() {
		
	}
	
}