package com.kh.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class A_Date {

	public void method1() {
		
		
		System.out.println("getMonth : " + (today.getMonth() + 1) + "분");
		System.out.println("getDate : " + (today.getDate() + "일");
		System.out.println("getHour : " + (today.getHour() + "시");
		System.out.println("getMinutes : " + today.getMinutes() + "분");
		System.out.println("getSeconds : " + today.getSeconds() + "초");
		// SimpleDateFormat : 날짜 데이터를 원하는 형태로 출력할 수 있도록
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH시 mm분 ss초");
		String FormatDate = sdf.format(today);
		// 2024년 7월 11일 (목) 12시 8분 30초
		System.out.println(formatDate);
	}
	
	/*
	 * Calendar 
	 * - Date 클래스를 개선한 추상 클래스 (JDK 1.1)
	 * - 여전히 단점이 존재
	 * */
	public void method2() {
		/*
		 * 추상 클래스이기 때문에 직접 객체 생성할 수 없다
		 * GetInstance() 메서드로 Calendar 클래스를 구현한 클래스의 객체를 반환
 		 * */
		Calendar today = Calendar.getInstance();
		today = new GregorianCalendar();
		System.out.println(today);
		
		// 년, 월, 일, 시, 분, 초
		System.out.println("YEAR : " + today.get(Calendar.YEAR) + "년" );
		System.out.println("MONTH : " + today.get(Calendar.MONTH) + "월" );
		System.out.println("DATE : " + today.get(Calendar.DATE) + "일" );
		System.out.println("HOUR : " + today.get(Calendar.HOUR) + "시" );
		System.out.println("HOUR_OF_DAY : " + today.get(Calendar.HOUR_OF_DAY) + "시" );
		System.out.println("MINUTE : " + today.get(Calendar.MINUTE) + "분" );
		System.out.println("SECOND : " + today.get(Calendar.SECOND) + "초" );
		
		// 날짜 지정
		Calendar date = Calendar.getInstance();
		date.set(2024, Calendar.JULY, 11);
		System.out.println(date.getTime()); // Date 객체로 반환
		
		// SimpleDateFormat 사용 가능
		// 24-07-11 12:35:26
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		String FormatDate = sdf.format(date);
		System.out.println(FormatDate);
		
	}
	
	public static void main(String[] args) {
		A_Date a = new A_Date();
//		a.method1();
		a.method2();

	}

}
