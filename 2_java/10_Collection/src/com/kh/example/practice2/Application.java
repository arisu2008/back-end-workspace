package com.kh.example.practice2;

import java.util.Scanner;

import com.kh.example.practice2.controller.MusicController;
import com.kh.example.practice2.model.Music;

public class Application {
	
	private Scanner sc = new Scanner(System.in);
	 private MusicController mc = new MusicController(System.in); 
	public static void main(String[] args) {
		Application app = new Application();
		app.menu;
		boolean check = true;
		try {
		while(check) {
			System.out.println("===== 메인메뉴 =====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 가수명 내림차순 정렬");
			System.out.println("8. 곡명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.println("메뉴 변호 입력 : ");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				addLastList();
				break;
			case 2:
				addFirstList();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				updateMusic();
				break;
			case 7:
				descArtist();
				break;
			case 8:
				ascSong();
				break;
			case 9:
				System.out.println("종료");
				check = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			
			}
				
		}catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		

public void addLastList() {
	System.out.println("****** 마지막 위치에곡추가******");
	System.out.println("곡명 : ");
	String song = sc.nextLine();
	System.out.println("가수명 : ");
	String artist = sc.nextLine();
	boolean result = mc.addLastList(new Music(artist, song));
	 System.out.println("추가 성공");
	 
}
public void addFirstList() {
	System.out.println("****** 마지막 위치에 곡 추가******");
	System.out.println("곡명 : ");
	String song = sc.nextLine();
	System.out.println("가수명 : ");
	String artist = sc.nextLine();
}		
public void printAll() {
	System.out.println("****** 전체 곡 목록 출력******");
	System.out.println("aespa - Supernova");
	System.out.println("이영지 - Small girl");
}
public void searchMusic() {
	System.out.println("****** 특정 곡 검색******");
	System.out.println("검색할 곡명 : ");
	String song = sc.nextLine();
	System.out.println("이영지 - Small girl 을 검색 했습니다.");

}
public void removeMusic() {
	System.out.println("****** 특정 곡 삭제******");
	System.out.println("삭제할 곡명 : ");
	String song = sc.nextLine();
	
	System.out.println("삭제할 곡이 없습니다.");
System.out.println("NewJeens - How Sweet 을 삭제했습니다.");
}
public void updateMusic() {
	System.out.println("****** 특정 곡 수정******");
System.out.println("검색할 곡명 : ");
String search = sc.nextLine();
System.out.println("수정할 곡 명 : ");
String song = sc.nextLine();
System.out.println("수정할 가수 명 ");
String artist = sc.nextLine();

System.out.println("수정할 곡을 찾지 못했습니다.");
System.out.println("이영지 - Small girl의 값이 변경되었습니다.");
}	
public void descArtist() {
	System.out.println("****** 가수 명 내림차순 정렬******");
	for(Music music : mc.descArtist()) {
		System.out.println(music);
	}
}
public void ascSong() {
	System.out.println("****** 곡명 오름차순 정렬******");
	for(Music music : mc.descArtist()) {
		System.out.println(music);
		}
	}
}

	
	
