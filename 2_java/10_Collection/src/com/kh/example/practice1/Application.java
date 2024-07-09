package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Application {

	
	public void method1() {
			
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> lotto = new ArrayList<Integer>();
		Vector v = new Vector();
		Vector v2 = new Vector();
		v.add(4);
		v.add(28);
		v.add(35);
		v.add(39);
		v.add(44);
		v.add(45);
		
		v2.add(35);
		v2.add(39);
		v2.add(30);
		v2.add(18);
		v2.add(20);
		v2.add(4);
System.out.println(v);		
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		for(int i = 1; i <= 6; i++) {
			lotto.add(list.get(i));
		} if(v == lotto ) {
			
		} else if (v2 == lotto) {
			
		}
	System.out.println(lotto);
	}
		
	
	public static void main(String[] args) {
		
		Application a = new Application();
		a.method1();
		
	}

}
