package com.kh._abstract.step2;

public class PineApplePizza extends Pizza {

	
	public PineApplePizza() {
		
	}
	@ Override
	public void info() {
		System.out.println(brand + "의 파인애플 피자 가격은 " + price + " 원 " );
	}
	@ Override
	public void toping() {
		System.out.println("토핑은 파인애플을 추가 한다");
		
	}
}
