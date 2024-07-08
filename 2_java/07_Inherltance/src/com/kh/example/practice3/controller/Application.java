package com.kh.example.practice3.controller;

import java.util.Scanner;

import com.kh.example.practice3.model.Employee.Employee;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	Employee viewEmployee = new Employee();
	EmployeeController employeeController = new EmployeeController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.employeeMenu();
		
		while(true) {
			int select = app.employeeMenu();
			switch(select) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
	}
}
		// 메인 메뉴를 출력하는 메서드
		private int employeeMenu() {
			System.out.println("1. 사원 정보 추가");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호를 누르세요 : ");
			return Integer.parseInt(sc.nextInt());
			
		}
		
		// 저장할 데이터를 사용자에게 받는 메서드
		public void insertEmp() {
			System.out.println("사원 번호 :");
//			int empNo = sc.nextInt();
			viewEmployee.setEmpNo(Integer.parseInt(sc.nextLine()));
			System.out.println("사원 이름 :");
//			String name = sc.nextLine();
			viewEmployee.setName(sc.nextLine());
			System.out.println("사원 성별 : ");
//			char gender = sc.nextLine().charAt(0);
			viewEmployee.setGender(sc.nextLine().charAt(0));
			System.out.println("전화 번호 : ");
//			String phone = sc.nextLine();
			viewEmployee.setPhone(sc.nextLine());
			System.out.println("추가 정보를 더 입력하시겠습니까?(y/n)");
			char add = sc.nextLine().charAt(0);
			if(add == 'y') {
				System.out.println("사원 부서 : ");
				String dept = sc.nextLine();
				System.out.println("사원 연봉 : ");
				int salary = Integer.parseInt(sc.nextLine());
				System.out.println("보너스 율 : ");
				double bonus = Double.parseDouble(sc.nextLine());
				employeeController.add(viewEmployee.getEmpNo()
						,viewEmployee.getName()
						,viewEmployee.getGender()
						,viewEmployee.getPhone(), dept, salary, bonus);
			} else {
				employeeController.add(viewEmployee.getEmpNo()
						,viewEmployee.getName()
						,viewEmployee.getGender()
						,viewEmployee.getPhone());
			}
			
			
		}
		
		// 수정할 데이터를 사용자에게 받는 메서드
		public void updateEmp() {
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화 번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("9. 돌아가기");
			System.out.println("메뉴 번호를 누르세요 : ");
			int select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1:
				System.out.println("전화 번호 입력 :");
				String phone = sc.nextLine();
				employeeController.modify(phone);
				break;
			case 2:
				System.out.println("사원 연봉 입력 :");
				int salary = Integer.parseInt(sc.nextLine());
				employeeController.modify(salary);
				break;
			case 3:
				System.out.println("보너스 율 입력 : ");
				double bonus = Double.parseDouble(sc.nextLine());
				employeeController.modify(bonus);
				break;
			case 9:
			
				default :
					
			}
		}
		
		// 데이터를 출력하는 메서드
		public void printEmp() {
			System.out.println(employeeController.info());			
		
		}
	}
	

