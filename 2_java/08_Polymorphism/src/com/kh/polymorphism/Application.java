package com.kh.polymorphism;

import com.kh.polymorphism.controller.EmployeeController;
import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.child.Manager;
import com.kh.polymorphism.model.child.Secretary;
import com.kh.polymorphism.model.parent.Employee;

/*
 * 다형성(Polymorphism)
 * - 하나의 객체변수가 여러가지 모양과 모습을 가지는 능력
 * - 부모 타입으로 자식 객체를 생성하는 것
 * */
public class Application {

	private static char[] employee;

	public static Employee main(String[] args, Object name) {
		
		Employee e1 = new Employee("우현성", 10000);
		Engineer e2 = new Engineer("이동엽", 5000, "자바", 200 );
		Manager m1 = new Manager("윤유진", 7000, "개발팀", 0);
		Secretary s1 = new Secretary("송준호", 6000, "우현성");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(m1);
		System.out.println(s1);
		
		Engineer e3 = new Engineer("이동엽", 5000, "자바", 200 );
		Manager m2 = new Manager("윤유진", 7000, "개발팀", 0);
		Secretary s2 = new Secretary("송준호", 6000, "우현성");
		System.out.println(e3);
		System.out.println(m2);
		System.out.println(s2);
		
		// 다형성 + 객체 배열
//		Employee[] empArr = {e1, e3 , m2, s2};
		
//		for(Employee employee : empArr) {
//			System.out.println(employee);
//		}
		
		/*
  	//찾는 사람의 연봉은?
	public int getAnnualSalary(Employee e) {
		return 0;
	}
	// 전체 사람들의 연봉 총합은?
	public int getTotalSalary(Employee[] empArr) {
		return 0;
	}*/
		
		Employee e4 = new Engineer("이동엽", 7000, "자바", 300);
		Employee s3 = new Secretary("송준호", 8000, "우현성");
		Employee[] empArr = {e4, m2, s3};
		System.out.println(e4);
		System.out.println(s3);
		System.out.println(empArr);
		
	/*	for(int i=0; < i empArr.length; i++) {
			if(empArr[i].getName().equals(name)) {
				return empArr[i];*/
			}
			System.out.println(employee);
		}
		EmployeeController control = new EmployeeController();
		//이름으로 사람찾기
		
		Employee result = control.findEmployeeByName("윤유진", empArr);
		
		System.out.println(result);
		
		// 이름으로 사람 찾기
		Employee result = control.findEmployeeByName("윤유진", empArr);
		System.out.println(result);
	}
		
		int resultAnnual = control.getAnnualSalary(result);
		System.out.println(resultAnnual);
		
		// 찾은 사람의 연봉은?
		public int getAnnualSalary(Employee e) {
			if(e instanceof Engineer) { // 특정 자식 객체 찾는 방법!
				Engineer engineer = (Engineer) e;
				return engineer.getSalary() * 12 + engineer.getBonus();
			}
			return e.getSalary() * 12;
			
		// 전체 사람들의 연봉 총합은?
		public int getTotalSalary(Employee[] empArr) {
			int sum = 0;
			for(Employee employee : empArr) {
						
			}
		int resultAnnual = control.getAnnualSalary(getAnnualSalary(result);
		System.out.println(resultAnnual);
			
		// 전체 총합
		System.out.println(control.getTotalSalary(empArr));
		}
	}
		




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

