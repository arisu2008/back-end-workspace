package com.kh.Inherltance.parent;


/*
 * 모든 클래스는 Object 클래스의 후손이다.
 * 즉, 최상위 클래스는 항상 Object이다.
 * Object 클래스에 있는 모든 메서드를 사용할 수 있다.
 * */
public class product {
	
	private String brand; // 브랜드
	String pCode; // 상품 코드
	protected String name;  // 상품명
	private int price;    // 가격
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [brand=" + brand + ", pCode=" + pCode + ", name=" + name + ", price=" + price + "]";
	}

}
