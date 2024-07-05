package com.kh.overriding.model;

import java.util.Objects;

public class Customer {
	protected String name; // 고객 이름
	protected String grade; // 고객 등급
	protected int bonusPoint; // 보너스 포인트
	protected double bonusRatio; // 보너스 적립 비율
	
	
	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";
		this.bonusRatio = 0.01;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint + ", bonusRatio="
				+ bonusRatio + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bonusPoint, bonusRatio, grade, name);
	}
	@Override // <-- 어노테이션! '이 메서드는 재정의된 메서드이다.' 라고 명확히 알려주는 역할
	public boolean equals(Object obj) {
		Customer c = (Customer) obj;
		return c.name == this.name;
	}
	
	public int calcprice(int price) {
		this.bonusPoint += price * bonusRatio; // 보너스 포인트 계산!
		return price;

		
	}
	
}













