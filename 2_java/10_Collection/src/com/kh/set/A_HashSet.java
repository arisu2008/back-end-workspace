package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.list.model.Person;

/*
 * Set의 특징
 * 
 * */

public class A_HashSet {
	public void method1() {
		HashSet<String> set = new HashSet<>();
		
		set.add("이제훈");
		set.add("구교환");
		set.add("홍사빈");
		set.add("이제훈");
		set.add("이제훈");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println("구교환이 포함되어 있는가? " + set.contains("구교환"));
		
		set.remove("홍사빈");
		System.out.println(set);
		
		set.clear();
		System.out.println("비어있는지? " + set.isEmpty());
		
	}
	
	public void method2() {
		
		
		/*
		 * Interator
		 * - 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
		 * - iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		 * */
		Iterator<Person> it = set.iterator
		while(it.hasNext()) { // 읽어올 요소가 있는지 확인
			System.out.println(it.next()); // 다음 요소를 읽어옴
		}
	}
	public static void main(String[] args) {

		A_HashSet a = new A_HashSet();
//		a.method1();
		a.method2();
	}

}
