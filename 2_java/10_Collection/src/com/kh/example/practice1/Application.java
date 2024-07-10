package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Application {

	
	public void method1() {
			
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i = 1; i <= 6; i++) {
		int num = (int) (Math.random() * 45 + 1);
		if(!lotto.contains(num)) {
			lotto.add(num);
		}
		
		int count = 0;
		
		while(true) {
			
			ArrayList<Integer> myLotto = new ArrayList<Integer>();
			
			while(myLotto.size() < 6) {
				int num = (int) (Math.random() * 45 +1);
				if(!myLotto.contains(num)) {
					myLotto.add(num);
				}
			}
		}
		
		System.out.println("로또 번호 : " + lotto);
		System.out.println("내 번호 : " + myLotto);
		
		Collections.sort(lotto);
		Collections.sort(myLotto);

		if(lotto.equals(myLotto)) {
			break;
		}
		}
	}
	
	public static void main(String[] args) {
		
		Application a = new Application();
		a.method1();
		
	}

}
