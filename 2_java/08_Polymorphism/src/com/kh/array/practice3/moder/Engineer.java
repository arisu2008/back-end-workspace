package com.kh.array.practice3.moder;

public class Engineer {

	private int coupon;
	private String title;
	private String BookTitle;
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public Engineer(int coupon, String title, String bookTitle) {
		super();
		this.coupon = coupon;
		this.title = title;
		BookTitle = bookTitle;
	}
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
