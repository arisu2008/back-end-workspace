package com.kh.array.practice3.moder;

public class Member {

	private String name;
	private int age;
	private int coupon;
	private int bookList;
	private String title;
	private String BookTitle;
	
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String BookTitle) {
		this.BookTitle = BookTitle;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public int getBookList() {
		return bookList;
	}
	public void setBookList(int bookList) {
		this.bookList = bookList;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", coupon=" + coupon + ", bookList=" + bookList + ", title="
				+ title + "]";
	}
}