package com.kh.example.practice1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		s.setkind(kind);
		s.setname(name);
		s.setflavor(flavor);
		s.setnumOf(numOf);
		s.setprice(price);
		
		public String confirmData() {
			// 저장된 데이터를 반환
			return s.getKind() + "(" + s.getName() + "  "
		}
		
		System.out.println("스낵류를 입력하세요.");
		System.out.println("종류 : ");
		String kind = sc.nextLine();
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.println("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.println("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		// -------------------------------------------------------
		// --> 즉, 여기까지는 controller나 model에 직접적근 X
		
		// 데이터들을 서버한테 요청! 서버한테 전달할 때는 controller로!
		SnackController controller = new SnackController();
		
		// 서버한테 요청해서 
		
		System.out.println("저장 완료되었습니다.");
		System.out.println(kind + "(" + name + " - " + flavor
								+ ") " + numOf + "개 " + price + "원");
		
	}

}


