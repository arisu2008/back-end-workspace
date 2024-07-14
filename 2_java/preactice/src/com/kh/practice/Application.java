package com.kh.practice;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.controller.BookController;
import com.kh.practice.model.Book;


public class Application {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	ArrayList<Book> books = new ArrayList<>();
	
	
	
	{
			books.add(new Book("밥을 지어요", true, 0)); 
			books.add(new Book("오늘은 아무래도 덮밥", false, 0)); 
			books.add(new Book("원피스 108", false, 15));
			books.add(new Book("귀멸의 칼날 23", false, 19));
	}
	public static void main(String[] args) {
		

	}

}
